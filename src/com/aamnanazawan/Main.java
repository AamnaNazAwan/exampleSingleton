package com.aamnanazawan;

class SingletonDemo {
    public static void main(String[] args) {
        Singleton tmp = null;
      tmp= Singleton.getInstance( );
        tmp.demoMethod( );
    }
}

