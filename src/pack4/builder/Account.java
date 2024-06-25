package pack4.builder;

public class Account {

    private int id;
    private String username;

    public static Builder builder() {
        return new Account().new Builder();
    }

    class Builder{

        public Account build() {
            return Account.this;
        }

        public Builder id(int id) {
            Account.this.id = id;
            return this;
        }

        public Builder username(String username) {
            Account.this.username = username;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
