package kr.ac.kopo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;
import kr.ac.kopo.vo.AccountVO;
import kr.ac.kopo.vo.BankInfoVO;

public class AccountDAO {
	
	private List<AccountVO> accountList;
	
	public AccountDAO() {
		accountList = new ArrayList<>(); 
	}
	
	@SuppressWarnings("resource")
	public void openAccount(AccountVO newAccount, String userId) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = new ConnectionFactory().getConnection();
			StringBuilder sql = new StringBuilder();
			sql.append("insert into account_tbl(account_num, account_owner,account_pwd, account_name, open_acc_date, bank_code, balance , user_id) ");
			sql.append(" values(?,?,?,?,?,?,?,?) ");
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, newAccount.getAccountNum());
			pstmt.setString(2, newAccount.getAccountOwner());			
			pstmt.setString(3, newAccount.getAccountPwd());
			pstmt.setString(4, newAccount.getAccountName());
			pstmt.setString(5, newAccount.getOpenDate());			
			pstmt.setString(6, newAccount.getBankCode());
			pstmt.setInt(7, newAccount.getBalance());
			pstmt.setString(8, userId);
			
			int cnt = pstmt.executeUpdate();
		
			if(cnt==1) {
				
				sql = new StringBuilder();
				sql.append("update user_tbl ");
				sql.append(" set last_open_acc_date = ? ");
				sql.append(" where id = ? ");
				
				pstmt = conn.prepareStatement(sql.toString());
				pstmt.setString(1, newAccount.getOpenDate());
				pstmt.setString(2, userId);
				pstmt.executeUpdate();
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	}
	
	//계좌 별칭 수정
	public String updateAccount(String accountNum, String newName) throws Exception {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int cnt = 0;
		String newAccName = null;
		
		try {
			conn = new ConnectionFactory().getConnection();
			StringBuilder sql = new StringBuilder();
			
			sql.append("update account_tbl ");
			sql.append(" set account_name = ? ");
			sql.append(" where account_num = ? ");
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, newName);
			pstmt.setString(2, accountNum);
			
			cnt = pstmt.executeUpdate();
			
			if( cnt == 1 ) {
				newAccName = newName;
			}
		} catch(Exception e) {
			
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		return newAccName;
	}
	
	public int deleteAccount(String accountNum, String pwd) throws Exception {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int cnt = -1;
		
		try {
			conn = new ConnectionFactory().getConnection();
			StringBuilder sql = new StringBuilder();
			
			sql.append(" delete from account_tbl ");
			sql.append(" where account_num = ? ");
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1,accountNum);
			
			
			cnt = pstmt.executeUpdate();
			System.out.println(cnt);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		
		
		return cnt;
	}
	
	//전체 게시글 조회
	public Map<AccountVO, BankInfoVO> searchAllAccountList(String userId) throws Exception{
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		Map<AccountVO, BankInfoVO> accountInfoMap = new HashMap<AccountVO, BankInfoVO>();
		AccountVO account = null;
		BankInfoVO bankInfo = null;
		
		
		try {
			conn = new ConnectionFactory().getConnection();
			//System.out.println("은행명\t통장명\t계좌번호\t개설일\t잔액");
			StringBuilder sql = new StringBuilder();

			
			sql.append("select a.bank_code, b.bank_name, a.account_owner, a.account_pwd, a.account_name, a.account_num , to_char(a.open_acc_date, 'yyyy/mm/dd') as open_date, a.balance ");
			sql.append(" from account_tbl a, bank_info b ");
			sql.append(" where a.bank_code = b.bank_code and user_id = ? ");
		
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, userId);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				account = new AccountVO();
				bankInfo = new BankInfoVO();
				account.setBankCode(rs.getString("bank_code"));
				bankInfo.setBankCode(rs.getString("bank_code"));
				bankInfo.setBankName(rs.getString("bank_name"));
				account.setAccountOwner(rs.getString("account_owner"));
				account.setAccountPwd(rs.getString("account_pwd"));
				account.setAccountName(rs.getString("account_name"));
				account.setAccountNum(rs.getString("account_num"));
				account.setOpenDate(rs.getString("open_date"));
				account.setBalance(rs.getInt("balance"));
				
				accountInfoMap.put(account,bankInfo);
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		
		return accountInfoMap;
	}
	
	@SuppressWarnings("resource")
	public int deposit(String accountNum, String pwd, int addedBalance) throws Exception {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int newBalance = -1;
		
		
		try {
			conn = new ConnectionFactory().getConnection();
			StringBuilder sql = new StringBuilder();
			
			sql.append("update account_tbl ");
			sql.append(" set balance = ? ");
			sql.append(" where account_num = ? and account_pwd = ?");
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, addedBalance);
			pstmt.setString(2, accountNum);
			pstmt.setString(3, pwd);
			
			int cnt = pstmt.executeUpdate();
			
			if(cnt ==1 ) {
				newBalance = addedBalance;
			} else {
				String accountPwd= null;
				sql = new StringBuilder();
				sql.append("select account_pwd from account_tbl ");
				sql.append(" where account_num = ? ");
				
				pstmt = conn.prepareStatement(sql.toString());
				pstmt.setString(1, accountNum);
				
				ResultSet rs = pstmt.executeQuery();
				
				if(rs.next()) {
					accountPwd = rs.getString("account_pwd");
				}
				
				if(!(accountPwd.equals(pwd))) {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
				
			}
			
			
		} catch(Exception e) {
			
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		
		return newBalance;
	}
	
	
@SuppressWarnings("resource")
public int withdraw(String accountNum, String pwd, int balanceAfterWithdraw) throws Exception {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int newBalance = -1;
		
		
		try {
			conn = new ConnectionFactory().getConnection();
			StringBuilder sql = new StringBuilder();
			
			sql.append("update account_tbl ");
			sql.append(" set balance = ? ");
			sql.append(" where account_num = ? and account_pwd = ?");
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, balanceAfterWithdraw);
			pstmt.setString(2, accountNum);
			pstmt.setString(3, pwd);
			
			int cnt = pstmt.executeUpdate();
			
			if(cnt ==1 ) {
				newBalance = balanceAfterWithdraw;
			} else {
				String accountPwd= null;
				sql = new StringBuilder();
				sql.append("select account_pwd from account_tbl ");
				sql.append(" where account_num = ? ");
				
				pstmt = conn.prepareStatement(sql.toString());
				pstmt.setString(1, accountNum);
				
				ResultSet rs = pstmt.executeQuery();
				
				if(rs.next()) {
					accountPwd = rs.getString("account_pwd");
				}
				
				if(!(accountPwd.equals(pwd))) {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
				
			}
			
			
		} catch(Exception e) {
			
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		
		return newBalance;
	}

	@SuppressWarnings("resource")
	public AccountVO transfer(String myAccountNum, String myPwd, int myBalanceAfterTransfer, int money, String transferredBank, String transferredAccNum) throws Exception {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		AccountVO transferredAccount = null;
		
		try {
			conn = new ConnectionFactory().getConnection();
			conn.setAutoCommit(false);
			StringBuilder sql = new StringBuilder();
			
			sql.append("update account_tbl ");
			sql.append(" set balance = ? ");
			sql.append(" where account_num = ? and account_pwd = ?");
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setInt(1, myBalanceAfterTransfer);
			pstmt.setString(2, myAccountNum);
			pstmt.setString(3, myPwd);
//			int withdrawCnt = pstmt.executeUpdate();
			pstmt.executeUpdate();
			
			
			sql.setLength(0);
			pstmt.clearParameters();
			
//			if(withdrawCnt == 1 ) {
////				newBalance = balanceAfterWithdraw;
//			} else {
//				String accountPwd= null;
//				sql.append("select account_pwd from account_tbl ");
//				sql.append(" where account_num = ? ");
//				
//				pstmt = conn.prepareStatement(sql.toString());
//				pstmt.setString(1, myAccountNum);
//				
//				ResultSet rs = pstmt.executeQuery();
//				
//				if(rs.next()) {
//					accountPwd = rs.getString("account_pwd");
//				}
//				
//				if(!(accountPwd.equals(myPwd))) {
//					System.out.println("비밀번호가 일치하지 않습니다.");
//				}
//				
//			}
			
			sql.setLength(0);
			sql.append(" select account_num, account_owner, balance from account_tbl ");
			sql.append(" where account_num = ? ");
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, transferredAccNum);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				transferredAccount = new AccountVO();
				transferredAccount.setAccountOwner(rs.getString("account_owner"));
				transferredAccount.setAccountNum(rs.getString("account_num"));
				transferredAccount.setBalance(rs.getInt("balance"));
			}
			
			if(transferredAccount != null) {
				sql.setLength(0);
				pstmt.clearParameters();
				sql.append(" update account_tbl ");
				sql.append(" set balance = ? ");
				sql.append(" where account_num = ? ");
				
				
				pstmt = conn.prepareStatement(sql.toString());
				pstmt.setInt(1, transferredAccount.getBalance() + money);
				pstmt.setString(2, transferredAccNum);
				
//				int depositCnt = pstmt.executeUpdate();
				pstmt.executeUpdate();
				
			}
			
			conn.commit();
		} catch(Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();	
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			
		} finally {
			JDBCClose.close(conn, pstmt);
		}
		
		return transferredAccount;
	}
	
	public int checkLastAccOpenDate(String loginedId) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int month = -1;
		
		try {
			conn = new ConnectionFactory().getConnection();
			
			StringBuilder sql = new StringBuilder();
			sql.append(" select nvl(trunc(months_between(sysdate, last_open_acc_date)),100) as month from user_tbl ");
			sql.append(" where id = ? ");
			
			pstmt = conn.prepareStatement(sql.toString());
			pstmt.setString(1, loginedId);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				month = rs.getInt("month");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(conn, pstmt);
		}
	
		return month;
	}
	
	
}
















