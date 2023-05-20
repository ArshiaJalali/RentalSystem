package org.example;

import java.io.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class App {
    public static void main(String[] args) throws IOException {
        // read from json
        Gson gson = new Gson();
        Reader reader = new FileReader("D:\\java\\RentalSystem\\ProjectTest\\src\\test\\TestYourFork.json");
        AllModule allModuleList = gson.fromJson(reader, new TypeToken<AllModule>() {
        }.getType());
        reader.close();

        Customer John = allModuleList.getCustomers().get(0);
        Customer John1 = new Customer(John.getName(),John.getEmail(),John.getPhone(),John.getAddress(),John.getId());
        allModuleList.getCustomers().set(0,John1);
        Customer Emily = allModuleList.getCustomers().get(1);
        Customer Emily1 = new Customer(Emily.getName(),Emily.getEmail(),Emily.getPhone(),Emily.getAddress(),Emily.getId());
        allModuleList.getCustomers().set(1,Emily1);
        Customer Brown = allModuleList.getCustomers().get(2);
        Customer Brown1 = new Customer(Brown.getName(),Brown.getEmail(),Brown.getPhone(),Brown.getAddress(),Brown.getId());
        allModuleList.getCustomers().set(2,Brown1);
        RentalStore r = new RentalStore();
        for(Item item : allModuleList.getBooks()){
            if (item.getId()==3){
                r.rentItem(item,John1);
            }else if(item.getId()==6){
                r.rentItem(item,John1);
            }
        }
        for(Item item : allModuleList.getBooks()){
            if (item.getId()==1){
                r.rentItem(item,Emily1);
            }else if(item.getId()==7){
                r.rentItem(item,Emily1);
            }
        }
        for(Item item : allModuleList.getBooks()){
            if (item.getId()==9){
                r.rentItem(item,Brown1);
            }else if(item.getId()==4){
                r.rentItem(item,Brown1);
            }
            /// write in json
            String json = gson.toJson(allModuleList);
            String filePath = "D:\\java\\RentalSystem\\ProjectTest\\src\\test\\TestYourFork.json";
            try {
                FileWriter writer = new FileWriter(filePath);
                writer.write(json);
                writer.close();
                System.out.println("JSON data has been written to the file successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
        }

