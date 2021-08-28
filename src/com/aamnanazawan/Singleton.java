package com.aamnanazawan;


public class Singleton {
    private static Singleton singleton = new Singleton();

    public static Singleton getInstance() {
        return null;
    }

    public void demoMethod() {
    }

    /* A private Constructor prevents any other
     * class from instantiating.
     */
    public class ClassicSingleton {

        private static com.aamnanazawan.ClassicSingleton instance = null;

        private ClassicSingleton() {
            // Exists only to defeat instantiation.
        }

        private void Singleton() {
        }

        /* Static 'instance' method */
        public Singleton getInstance() {
            return singleton;
        }

        /* Other methods protected by singleton-ness */
        protected static void demoMethod() {
            System.out.println("demoMethod for singleton");

        }
    }
}

