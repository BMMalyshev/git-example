package Lessons;

public class Switch {
    public static void main(String[] args) {
        var month = 12;

        switch (month){
            case 1,2,12: {
                System.out.println("Winter");
                break;
        }
            case 3,4,5: {
                System.out.println("Spring");
                break;
            }
        }
        /*switch (month) {
            case 1:
            case 2:
            case 12:{
                System.out.println("Winter");
                break;
        }
                case 3:
                case 4:
                case 5: {
                    System.out.println("Spring");
                    break;
                }
                case 6:
                case 7:
                case 8: {
                    System.out.println("Summer");
                    break;
                }
                case 9:
                case 10:
                case 11: {
                    System.out.println("Autumn");
                    break;
                }
            }*/
        }
    }
