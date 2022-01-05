package com.company.model;

import com.company.commons.UIDGenerator;
import com.company.commons.Validator;
import com.company.commons.constants.RegExp;

public class People {
    private  String id;
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String education;
    private String experience;
    private String trainings;
    private String imagePath;

    public People() {
        setId();
        setFirstName("notDefined");
        setLastName("notDefined");
        setPhone("notDefined");
        setEmail("notDefined");
        setEducation("notDefined");
        setExperience("notDefined");
        setTrainings("notDefined");
        setImagePath("notDefined");
    }

    public People(
            String firstName,
            String lastName,
            String phone,
            String email,
            String education,
            String experience,
            String trainings,
            String imagePath
    ) {
        setId();
        setFirstName(firstName);
        setLastName(lastName);
        setPhone(phone);
        setEmail(email);
        setEducation(education);
        setExperience(experience);
        setTrainings(trainings);
        setImagePath(imagePath);
    }

    public String getId() {
        return id;
    }

    private void setId() {
        this.id = UIDGenerator.getUID();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.equals("")) {
            this.firstName = "notDefined";
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.equals("")) {
            this.lastName = "notDefined";
        } else {
            this.lastName = lastName;
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (Validator.doValidation(RegExp.regexPhone, phone)) {
            this.phone = phone;
        } else {
            this.phone = "notDefined";
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (Validator.doValidation(RegExp.regexEmail, email)) {
            this.email = email;
        } else {
            this.email = "notDefined";
        }
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        if (education == null || education.equals("")) {
            this.education = "notDefined";
        } else {
            this.education = education;
        }
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        if (experience == null || experience.equals("")) {
            this.experience = "notDefined";
        } else {
            this.experience = experience;
        }
    }

    public String getTrainings() {
        return trainings;
    }

    public void setTrainings(String trainings) {
        if (trainings == null || trainings.equals("")) {
            this.trainings = "notDefined";
        } else {
            this.trainings = trainings;
        }
    }
    public String getImagePath() {
        return imagePath;
    }
    public void setImagePath(String imagePath) {
        if (imagePath == null || imagePath.equals("") || imagePath.equals("notDefined")) {
            this.imagePath = "Img/cv.png";
        } else {
            this.imagePath = imagePath + getFirstName() + getLastName() + ".jpg";
        }
    }


    @Override
    public String toString() {
        return "People{" +
                "ID='" + id + '\'' +
                ", firstname='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", education='" + education + '\'' +
                ", experience='" + experience + '\'' +
                ", trainings='" + trainings + '\'' +
                ", imagePath='" + imagePath + '\'' +
                '}';
    }
}
