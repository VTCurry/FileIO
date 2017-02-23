package com.novauc;

import jodd.json.JsonSerializer;
import jodd.json.meta.JSON;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Main {

        public static void main(String[] args) throws IOException{


            File items = new File("items.json");


                ArrayList<Menu> List = new ArrayList<Menu>();

                FileWriter filewriter = new FileWriter(items, true);

                Scanner reader = new Scanner(items);


                String steak;
                String seasonning;
                int size;
                String side;
                boolean lobster;

                Scanner scanner = new Scanner(System.in);

                System.out.println("Welcome to Outback Steakhouse!");

                System.out.println("Steak?");
                steak = scanner.nextLine();

                System.out.println("Seasonning?");
                seasonning = scanner.nextLine();

                System.out.println("Size?");

                size = Integer.parseInt(scanner.nextLine());

                System.out.println("Side?");
                side = scanner.nextLine();

                System.out.println("Steamed Lobster Tail?");
                if (scanner.nextLine().equals("yes")) {
                    lobster = true;
                } else {
                    lobster = false;
                }

                Menu menu = new Menu(steak, seasonning, size, side, lobster);

                System.out.println(menu);

                JsonSerializer jsonSerializer = new JsonSerializer();
                String s = jsonSerializer.serialize(menu);
                filewriter.write(s);
                filewriter.close();
                System.out.println("enter a number please!");
            }
        }