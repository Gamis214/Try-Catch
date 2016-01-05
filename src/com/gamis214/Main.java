package com.gamis214;

public class Main {

    public static void main(String[] args) {

        Main mn = new Main();

	    try{
            mn.divison();
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }finally {
            System.out.println("MSJ FINAL");
        }

    }

    private void divison(){
        int a = 7/0;
    }

}
