package io.github.MIRIANJSM.utils;

import com.github.javafaker.Faker;
import org.junit.Assert;

import java.util.Locale;

public class Utils {

    public static Faker faker = new Faker(new Locale("pt-BR"));

    public static String getBaseUrl() {
        String baseUrl = null;
        baseUrl = "https://dummyjson.com/";
        return baseUrl;
    }


}
