package id.ac.polinema.aplikasiproject;

import android.se.omapi.Session;

import id.ac.polinema.aplikasiproject.models.A;

public class Application extends android.app.Application{
    private static Session session;
    private static A account;
    @Override
    public void onCreate() {
        super.onCreate();
        account = new A("Nida");
    }

    public static Session getSession() {
        return session;
    }
}
