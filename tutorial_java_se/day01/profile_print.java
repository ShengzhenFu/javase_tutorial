package day01;

import java.util.Scanner;

/*
 * this example is to let you know 
 * how to read input from console
 * how to print it in the console
 * */
public class profile_print {
    public String name;
    public String country;
    public String hobby;
    public String wechat;
    public int age;

    public profile_print(String name, String country, String hobby, String wechat, int age){
        this.name = name;
        this.country = country;
        this.hobby = hobby;
        this.wechat = wechat;
        this.age = age;
    }

    public void run(){
        System.out.println("your profile_print:\nname: "+name+"\ncountry: "+country+"\nhobby: "+hobby+"\nwechat: "+wechat+"\nage: "+age);
    }

    public static void main(String[] arg){
        Scanner reader = new Scanner(System.in);
        String name = null;
        String country = null;
        String hobby = null;
        String wechat = null;
        int age = 0;

        System.out.println("what is your name: ");
        while(reader.hasNext()) {
            name = reader.nextLine();
            System.out.println("which country you are: ");
            country = reader.nextLine();
            System.out.println("what is your hobby: ");
            hobby = reader.nextLine();
            System.out.println("your wechat id: ");
            wechat = reader.nextLine();
            System.out.println("how old are you");
            age = reader.nextInt();
            break;
        }
        profile_print show = new profile_print(name, country, hobby, wechat, age);
        if(age >0 & age < 150){
            show.run();
        }
        else {
            System.out.println("the age you input is not correct, please try again");
        }

    }



}
