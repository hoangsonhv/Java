package Labs.s7;

import java.util.ArrayList;
import java.util.Scanner;

public class News implements INews {
    public int id;
    public String title;
    public String publishDate;
    public String author;
    public String content;
    public float averageRate;
    int[] RateList = new int[3];

    public News(){

    }

    public News(int id, String title, String publishDate, String author, String content, float averageRate, int[] rateList) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
        RateList = rateList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void Display() {
        System.out.println("Title: "+getTitle());
        System.out.println("PublishDate: "+getPublishDate());
        System.out.println("Author: "+getAuthor());
        System.out.println("Content: "+getContent());
        System.out.println("Average: "+getAverageRate());
    }

    public void Caculate(){
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i< RateList.length;i++){
            System.out.println("Nhập Giá Trị Cho Phần Tử Thứ "+i);
            RateList[i] = sc.nextInt();
        }
        for (int i = 0;i< RateList.length;i++){
            this.averageRate+= RateList[i];
        }
        this.averageRate = averageRate/ RateList.length;
        System.out.println("Trung Bình Cộng Là:"+averageRate);
    }
}
