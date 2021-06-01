package kr.ac.kopo.vo;

public class UserVO {
	
		private String id;
		private String password;
		private String name;
		private String birthDate;
		private String lastAccountDate; //user의 최종 계좌 개설일

		public UserVO() {
			super();
			// TODO Auto-generated constructor stub
		}

		public UserVO(String id, String password, String name, String birthDate, String lastAccountDate) {
			super();
			this.id = id;
			this.password = password;
			this.name = name;
			this.birthDate = birthDate;
			this.lastAccountDate = lastAccountDate;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBirthDate() {
			return birthDate;
		}

		public void setBirthDate(String birthDate) {
			this.birthDate = birthDate;
		}

		public String getLastAccountDate() {
			return lastAccountDate;
		}

		public void setLastAccountDate(String lastAccountDate) {
			this.lastAccountDate = lastAccountDate;
		}
		
		@Override
		public String toString() {
			return "UserVO [id=" + id + ", password=" + password + ", name=" + name + ", birthDate=" + birthDate
					+ ", lastAccountDate=" + lastAccountDate + "]";
		}
		
	}

