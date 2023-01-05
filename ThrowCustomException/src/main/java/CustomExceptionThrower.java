
public class CustomExceptionThrower {

    /**
     * This method should throw a CustomException. CustomException is a custom exception that we've written ourselves
     * by extending the Exception class in CustomException.java. In a large scale application, writing custom
     * exceptions could provide valuable information for when something goes wrong in the application.
     *
     * I recommend looking at the test case for a good example of try/catch block usage, as well.
     */
    public void throwCustomException(){
        
        class OddCalculator{
            public int sumOddNumbers(int a, int b)throws CustomException {
                if(a%2==0) {
                    throw new CustomException("First number was even!");
                } else if (b%2==0){
                    throw new CustomException("Second numver was even!");
                }
            }return (a+b);
        }
    }
}