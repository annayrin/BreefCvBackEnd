package com.company.commons.constants;

public class RegExp {
    public static final String regexEmail = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

    public static final String regexPhone = "^[+][3][7][4][-\\s/0-9]{8,16}$|[0][-\\s\\./0-9]{8,12}$"; // no funccionaba con el anterior

}
