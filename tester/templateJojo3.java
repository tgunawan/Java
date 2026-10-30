// package megaladoncare;
//𒅌

import java.util.Scanner;

public class templateJojo3 {

    static void opsi(){
            System.out.println("=======================================");
            System.out.println("1. Feed");
            System.out.println("2. Play");
            System.out.println("3. Sleep");
            System.out.println("4. Exit");
            System.out.println("=======================================");
    }







    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.println("Welcome to Megaladon Care Simulation ");
            System.out.println("Here I will give you this newly hatch Megaladon, so give it a name");            
            System.out.print("Input your Megaladon a nicname (Default: Jimmy): ");
            String name = input.nextLine();
            if (name.isEmpty()) {
                name = "Jimmy";
            }
            System.out.println("Wow " + name + "! He realy Likes that name!");
            System.out.println("Here is your new Megaladon:");
            System.out.println("-o|^|(");
            System.out.println("First YOu need a guide manuel to care a megaladon");
            System.out.println("*Item Obtain: " + "Megaladon Guide Manuel");
            System.out.println("Now you are ready to care your new friend!");
            int age = 0;
            int hunger = 1;
            int sleep = 10;
            int joy = 0;

            while(true){
            hunger = Math.max(0, hunger);
            joy = Math.max(0, joy);
            sleep = Math.max(0, sleep);
            double agemodif=0.0;
            int ageTicks = 0;
            ageTicks++;
            if (ageTicks >= 4) { 
                age++;
                ageTicks = 0;
                System.out.println("\n🎉 Selamat! " + name + " tumbuh semakin tua. Usia sekarang: " + age);
            }
            if (age <= 10) {
                agemodif = 2.0; // Fase Bayi: stat turun 2x lebih cepat
            }   else if (age > 10 && age <= 25) {
                agemodif = 1.5; // Fase Tua: stat turun 1.5x lebih cepat
            } else if (age > 25) {
                agemodif = 1.1; // Fase Dewasa: stat turun 1.1x lebih cepat
            }
            opsi();
            System.out.println("Hunger="+hunger+"/"+100+"|Joy="+joy+"/"+100+"|Sleep="+sleep+"/"+100);
            System.out.println("=======================================");
            System.out.println("What would you like to do?");
            String choiceInput = input.nextLine().trim();
            int choice;
            try {
                choice = Integer.parseInt(choiceInput);
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Masukkan angka 1 sampai 4.");
                continue;
            }

            switch (choice) {
                    case 1:
                        if (hunger > 0 && sleep == 0){
                            System.out.println("Your Megaladon is to Tired to eat");
                            joy = joy - (int) (5*agemodif) ;  
                            break;
                        }
                        else if (hunger >= 100) {
                            System.out.println("Your Megaladon is not hungry");
                            break;
                        }else{
                            hunger = hunger + 25 ;
                            sleep = sleep - (int) (15*agemodif);
                        }
                        //Feed

                        break;
                    case 2:
                        if (hunger == 0){
                            System.out.println("Your Megaladon is to Hungry to play");
                            joy = joy - (int) (1*agemodif) ;  
                            break;
                        }
                        else if (sleep == 0){
                            System.out.println("Your Megaladon is to Tired to play");
                            joy = joy - (int) (1*agemodif) ;  
                            break;
                        }else if (joy >= 100) {
                            System.out.println("Your Megaladon is not In the mood to play");
                            break;
                        }else{
                            joy = joy + 30 ;
                            sleep = sleep - (int) (10*agemodif);
                            joy = joy - (int) (5*agemodif) ;                        
                            System.out.println("Your Megaladon had some fun");
                        }
                        //Play
                        break;
                    case 3:
                        if (sleep > 0 && hunger == 0){
                            System.out.println("Your Megaladon is to hungryto sleep");
                            joy = joy - (int) (5*agemodif) ;  
                            break;
                        }else if (sleep >= 100) {
                            System.out.println("Your Megaladon is not Tired");
                            break;
                        }else{
                            joy = joy - (int) (10*agemodif) ;
                            hunger = hunger - (int) (10*agemodif);
                            sleep = sleep + 50;
                        }                    
                        //Sleep
                        break;
                    case 4:
                        //Exit
                        return;
                    default:
                        System.out.println("Pilihan tidak valid. Masukkan angka 1 sampai 4.");
                        break;
            }       
        }
    }


}
