package vut;

/**
 *
 * @author MABASA NHLOHLOTELO
 */
import java.util.Scanner;
public class Restaurants {
    int option;
    public void Brand(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to MrD"+"\nChoose Restaurant: "+"\n1. KFC"+"\n2. McDonalds"+"\n3. Exit");
        System.out.print("Enter option: ");
        option = sc.nextInt();
        System.out.println("-".repeat(50));
        if(option==1){
            KFC();
        }
    }
    
    public void KFC(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to KFC"+"\nMenu: "+"\n1. Wings"+"\n2. Streetwise"+"\n3. Bucket"+"\n4. Exit");
        System.out.print("Enter Option: ");
        option=sc.nextInt();
        System.out.println("-".repeat(50));
        
        if(option==1){
            while(true){
                System.out.println("KFC Wings Menu: "+"\n1. 5 Wings R45"+"\n2. 9 Wings R70"+"\n3. Box for two R120"+"\n4. Exit");
                System.out.print("Enter Option: ");
                option=sc.nextInt();
                System.out.println("-".repeat(50));
                
                if(option==1){
                    System.out.println("Enjoy your 5 Wings");
                    break;
                }
                else if(option==2){
                    System.out.println("Enjoy your 9 Wings");
                    break;
                }
                else if(option==3){
                    System.out.println("Enjoy your box for two wings");
                    break;
                }
                else if(option==4){
                    break;
                }
                else{
                    System.out.println("Enter a valid option");
                }
            }
        }
        else if(option==2){
            while(true){
                System.out.println("KFC Streetwise Menu: "+"\n1. Streetwise 2"+"\n2. Streetwise 3"+"\n3. Streetwise 4"+"\n4. Streetwise 5"+"\n5. Exit");
                System.out.print("Enter Option: ");
                option=sc.nextInt();
                System.out.println("-".repeat(50));
                switch(option){
                    case 1:
                        System.out.println("Enjoy your streetwise 2");
                        break;
                    case 2:
                        System.out.println("Enjoy your streetwise 3");
                        break;
                    case 3:
                        System.out.println("Enjoy your streetwise 4");
                        break;
                    case 4:
                        System.out.println("Enjoy your streetwise 5");
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Invalid option choose again");
                        
                }
                break;
            }
        }
        
        
    else if(option==3){
    while(true){
        System.out.println("KFC Bucket Menu: "+"\n1. 9 piece bucket R110"+"\n2. 15 piece bucket R160"+"\n3. 21 piece bucket R230"+"\n4. Exit");
        System.out.print("Enter option: ");
        option = sc.nextInt();
        
        switch(option){
            case 1:
                System.out.println("Enjoy your 9 piece bucket");
                break;
            case 2:
                System.out.println("Enjoy your 15 piece bucket");
                break;
            case 3:
                System.out.println("Enjoy your 21 piece bucket");
                break;
            case 4:
                break;
            default:
                System.out.println("Enter a valid option");
        }
        break;
    }
}
    else if(option==4){
        while(true){
            System.out.println("closing");
            break;
        }
    }
    }
    
}
