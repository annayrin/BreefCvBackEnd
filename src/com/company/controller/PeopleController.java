package com.company.controller;

import com.company.commons.constants.fileConstants;
import com.company.model.People;
import com.company.service.JsonParser;
import com.company.service.impl.JsonParserGson;

import java.util.LinkedList;
import java.util.List;

public class PeopleController {
    List<People> peopleList = new LinkedList<>();

    public void generateData() {
        People people = new People(
                "Alexandr",
                "Hambarcumyan",
                "+37493114415",
                "alexanhambarcumyan@gmail.com",
                "Shushi Technology university",
                "AIPC",
                "RELQ school",
                "Img/"
        );
        peopleList.add(people);

        people = new People(
                "Anahit",
                "Khechumyan",
                "+374 44 14 80 00",
                "Khechumyan63@gmail.com",
                "Yerevan State University",
                "School Principal-School N67 Bitschool",
                "RELQ",
                "Img/"
        );
        peopleList.add(people);
        people = new People(
                "Narek",
                "Tovmasyan",
                "+374-94-27-67-00",
                "Narektom333@gmail.com",
                "Armenian State University of Economics",
                "Ameria bank",
                "Relq Technology",
                "Img/"
        );
        peopleList.add(people);
        people = new People(
                "Lusine",
                "Yeremyan",
                "+374-43-18-18-34",
                "lusineer@gmail.com",
                "Armenian State University of Economics",
                "Yerevan Municipality",
                "Relq Technology",
                "Img/"
        );
        peopleList.add(people);
        people = new People(
                "Larine",
                "Danielyan",
                "+374-97-75-95-99",
                "danielyanlari@gmail.com",
                "Economics and Management",
                "Martuninsky district Medical Association",
                "Relq Technology",
                "Img/"
        );
        peopleList.add(people);
        people = new People(
                "Hasmik",
                "Gevorgyan",
                "+374-99-46-36-23",
                "gevorgyan.icml@gmail.com",
                "YEREVAN STATE COLLEGE OF INFORMATICS",
                "Mon Amie Flowers & Design boutique",
                "RELQ",
                "Img/"
        );
        peopleList.add(people);
        people = new People(
                "Sevak",
                "Stepanyan",
                "+37477121696",
                "stepanyansevak9@gamil.com",
                "Economics and Management",
                "Not Defined",
                "Relq Technology",
                ""
        );
        peopleList.add(people);
        people = new People(
                "Seryoja",
                "Asatryan",
                "+374-94-24-68-80",
                "seryozha.asatryan02@gmail.com",
                "Economics",
                "Not Defined",
                "Relq Technology",
                "Img/"
        );
        peopleList.add(people);

        people = new People(
                "Tigran",
                "Martirosyan",
                "+374-77-15-18-68",
                "martirosyant01@mail.ru",
                "",
                "",
                "Relq",
                "Img/"
        );
        peopleList.add(people);
        people = new People(
                "Armenak",
                "Qocharyan",
                "+374-94-90-21-71",
                "qocharyanarmenak@gmail.com",
                "Բարձրագույն զինվորական",
                "ՀՀ ՊՆ",
                "Relq Technology",
                "Img/"
        );
        peopleList.add(people);

        people = new People(
                "Seda",
                "Shahnazaryan",
                "+37498313871",
                "shahnazaryan.seda@mail.ru",
                "Higher Education:Historian",
                "TechBoost4Women",
                "Relq Technology",
                "Img/"
        );
        peopleList.add(people);

        people = new People(
                "Lusya",
                "Petrosyan",
                "+374-93-32-29-02",
                "plusine99@gmail.com",
                "Armenian State University faculty of Radiophysics",
                "",
                "Relq Technology",
                "Img/"
        );
        peopleList.add(people);

        people = new People(
                "Anna",
                "Hayriyan",
                "+374-98-14-44-50",
                "annhayriyan@gmail.com",
                "ASUE",
                "Scott Logistics",
                "RELQ",
                ""
        );

        peopleList.add(people);

        people = new People(
                "Marat",
                "Harutyunyan",
                "+374-44-05-51-50",
                "maratharutyunyan.mh.mh@gmail.com",
                "ASIPCS",
                "EL Market",
                "Relq Technology",
                "Img/"
        );
        peopleList.add(people);

        people = new People(
                "Liana",
                "Dashyan",
                "+37491555374",
                "dashyanlian@gmail.com",
                "YSU",
                "GYU NGO",
                "Relq Technology",
                ""
        );
        peopleList.add(people);

        people = new People(
                "Arusyak",
                "Aghajanyan",
                "+374-55-90-01-55",
                "aghajanyanarusyak@gmail.com",
                "YSUGU",
                "InecoBank CJSC",
                "HTI Armenia C++ basic, SmartCode,Relq Technology",
                "Img/"
        );
        peopleList.add(people);

        people = new People(
                "Karen",
                "Darbinyan",
                "+37498156247",
                "kar31100@gmail.com",
                "Armenian State University faculty of Informatics and Applied mathematics ",
                "",
                "",
                "Img/"
        );
        peopleList.add(people);

        people = new People(
                "Ani",
                "Antonyan",
                "+374-41-90-08-02",
                "antonyanani30@gmail.com",
                "",
                "",
                "Relq",
                "Img/"
        );
        peopleList.add(people);

        people=new People(
                "Afina",
                "Panyan",
                "",
                "afina.panyan00@gmail.com",
                "",
                "",
                "Relq","");
        peopleList.add(people);

        people=new People(
                "Babken",
                "Tadevosyan",
                "+374 93 28 55 95",
                "",
                "",
                "",
                "Relq","");
        peopleList.add(people);

        people=new People(
                "Hermine",
                "Sahakyan",
                "",
                "",
                "",
                "",
                "Relq",
               ""
        );
        peopleList.add(people);

        people=new People(
                "Hermine",
                "Melqumyan",
                "",
                "",
                "",
                "",
                "Relq",
                "Img/"
        );
        peopleList.add(people);
        people=new People(
                "Silva",
                "Ohanyan",
                "",
                "",
                "",
                "",
                "Relq School",
                "");
        peopleList.add(people);

        people=new People(
                "Suren",
                "Galstyan",
                "",
                "",
                "",
                "",
                "Relq School",
                "");
        peopleList.add(people);
    }



    public void writeInFileWithJson(){
        JsonParser jp = new JsonParserGson();
        jp.parseToJsonAndWriteInFile(peopleList.toArray(new People[0])); //no entendi
        System.out.println("everything is ok");
    }


}
