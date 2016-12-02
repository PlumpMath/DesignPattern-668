/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagemaker;

import java.io.*;
/**
 *
 * @author wataru
 */
public class HtmlWriter {
    private OutputStreamWriter writer;
    public HtmlWriter(OutputStreamWriter writer){
        this.writer = writer;
    }
    public void title(String title) throws IOException {
        writer.write("<html>");
        writer.write("<head>");
        writer.write("<title>" + title  + "</title>");
        writer.write("</head>");
        writer.write("<body>\n");
        writer.write("<h1>" + title + "</h1>\n");
    }
    public void paragraph(String msg) throws IOException{
        writer.write("<p>" + msg + "</p>\n");
    }
    public void link(String href, String caption) throws IOException{
        paragraph("<a href=\"" + href + "\">" + caption + "</a>");
    }
    public void mailto(String mailaddr, String username) throws IOException{
        link("mailto:" + mailaddr, username);
    }
    public void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>\n");
        writer.close();
    }
}
