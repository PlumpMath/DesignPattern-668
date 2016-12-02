/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagemaker;

import java.io.*;
import java.util.Properties;
/**
 *
 * @author wataru
 */
public class PageMaker {
    private PageMaker(){
        
    };
    public static void makeWelcomePage(String mailaddr, String filename){
        try{
            Properties mailprop = Database.getProperties("maildata");
            String username = mailprop.getProperty(mailaddr);
            FileOutputStream f = new FileOutputStream(filename);
            OutputStreamWriter out = new OutputStreamWriter(f, "UTF8");
            HtmlWriter writer = new HtmlWriter(out);
            writer.title("welcome to " + username + "'s page!");
            writer.paragraph(username + "のページへようこそ。");
            writer.paragraph("メールまっていますね");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + "(" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
