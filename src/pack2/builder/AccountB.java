package pack2.builder;

public class AccountB {
    public static void main(String[] args) {
        Account account = Account
                .builder()
                .setUserName("Anil")
                .setEmail("test")
                .build();

        System.out.println(account);
    }
}

class Account {

    private String username;
    private String email;

    public static Builder builder() {

        return new Account().new Builder();
    }

    class Builder {
        public Builder setUserName(String username) {
            Account.this.username = username;
            return this;
        }

        public Builder setEmail(String email) {
            Account.this.email = email;
            return this;
        }

        public Account build() {
            return Account.this;
        }
    }


    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

