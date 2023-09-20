package InitJava;

public class ThisStringBuilder {

	 public static void main(String[] args) {
	        String concatString = "";
	        long startTimeString = System.nanoTime();    
	        for (int i =0;i<10000;i++) {
	            concatString+="Some String";
	        }
	        long endTimeString = System.nanoTime();
	        long duration = endTimeString - startTimeString;
	        System.out.println("Duration time : " + duration);
	        long startSecond = System.nanoTime();
	        StringBuilder testStringBuilder = new StringBuilder();
	        for(int i=0;i<10000;i++) {
	            testStringBuilder.append("Some Text");
	        }
	        long endSecondTimeString = System.nanoTime();
	        long durationSecond = endSecondTimeString - startSecond;
	        System.out.println("Duration time : " + durationSecond);
	    }
	}