/**
 * 
 */
package sef.module2.activity;

/**
 * @author 
 *
 */
public class NumToWordsUsingMethod {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			//TODO complete the code to print text value of 8, 9 and 10
			printMyWord(10);

		}

		private static void printMyWord(int i) {
			final String numText;
			switch(i) {
			case 1:
				numText = " The number you entered is : ONE";break;
			case 2:
				numText = " The number you entered is : TWO";break;
			case 3:
				numText = " The number you entered is : THREE";break;
			case 4:
				numText = " The number you entered is : FOUR";break;
			case 5:
				numText = " The number you entered is : FIVE";break;
			case 6:
				numText = " The number you entered is : SIX";break;
			case 7:
				numText = " The number you entered is : SEVEN";break;
			case 8:
				numText = " The number you entered is : EIGHT";break;
			case 9:
				numText = " The number you entered is : NINE";break;
			case 10:
				numText = " The number you entered is : TEN";break;
			default:
				numText = "  The number you entered is : " + i +" Enter 1 to 10";
			}
			System.out.println(numText);
			
		}


		

	}
