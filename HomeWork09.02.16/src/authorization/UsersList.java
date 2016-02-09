package authorization;


public enum UsersList {
    GUEST("GUEST"){
        @Override
        public String toString() {
            return "Hello guest";
        }
    },
    DEFAULT_USER("USER"){
        @Override
        public String toString() {
            return "You just the user";
        }
    },
    MODER("MODER"){
        @Override
        public String toString() {
            return "You are moder";
        }
    },
    ADMIN("ADMIN"){
        @Override
        public String toString() {
            return "You are Admin";
        }
    };

    public String users;

     UsersList(String logIn){
         this.users = logIn;
    }

    public static UsersList findUser(String loginInfo){
        for (UsersList usersList : values()){
            if (loginInfo.equals(usersList.users)){
                return usersList;
            }
        }
        return GUEST;
    }

}
