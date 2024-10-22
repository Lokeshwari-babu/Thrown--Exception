class LowBalException extends Exception {
    LowBalException(String msg) {
        super (msg);
    }
}
class Account {
    public void withdrawl(int amount)throws LowBalException {
        int acc_Bal = 500;
        try {
            if (acc_Bal > amount) {
                System.out.println("Go and Enjoy");
            }else {
                throw new LowBalException("Go to psa");
            }
        }catch (LowBalException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void main(String[] args) throws LowBalException {
        new Account().withdrawl(4500);
        
    }
}

