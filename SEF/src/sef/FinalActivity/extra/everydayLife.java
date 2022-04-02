package sef.FinalActivity.extra;

public interface everydayLife {
    String doWork();
    default String doRest(Activity personalHobby) {
        if (personalHobby == null) { personalHobby=new Hobby(); }
        return personalHobby.doActivity();
    }
}
