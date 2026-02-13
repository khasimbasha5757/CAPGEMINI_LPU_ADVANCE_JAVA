package MockitoPractice;

public class UserService {
		UserDao dao;
		public UserService(UserDao dao){
			this.dao=dao;
		}
		public String typeOfUser(int id) {
			User user=dao.findById(id);
			dao.findById(id);
			if(user.getBalance()>0 && user.getBalance()<=1000) {
				return "New user";
			}
			else if(user.getBalance()>1001 && user.getBalance()<=2000) {
				return "Regular user";
			}
			else {
				return "Premium user";
			}
		}
}
