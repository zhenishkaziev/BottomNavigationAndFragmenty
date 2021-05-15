package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class ServerForHome {


    public static List<HomeModel> list;


    public static List<HomeModel> getModel() {
        list = new ArrayList<>();
        list.add(new HomeModel("SpaceX раскрывает конкретные подробности о первом испытательном орбитальном полете Starship", R.drawable.kosmos));
         list.add(new HomeModel("Китайская посадочная платформа с марсоходом совершила успешную посадку на Марсе", R.drawable.mars));
         list.add(new HomeModel("Twitter проинформировала Роскомнадзор об удалении публикаций с запрещенным в России контентом", R.drawable.twitter));
         list.add(new HomeModel("Apple уволила сотрудника через несколько часов после петиции об его увольнении", R.drawable.aple));
         list.add(new HomeModel("«Градусник» из инертных газов показал температуру Земли 20 тысяч лет назад", R.drawable.ice));
         list.add(new HomeModel("Глава WeWork заявил, что лучшие работники — те, которые мечтают вернуться с удаленки", R.drawable.work));
         list.add(new HomeModel("Создатель Ethereum пожертвовал $ 1 млрд в мем-валюте на борьбу Индии с коронавирусом", R.drawable.lisa));
         list.add(new HomeModel("Amazon успешно оспорила штраф на 250 миллионов евро в Евросоюзе", R.drawable.amazon));
         list.add(new HomeModel("«Флант» покупает компанию Okmeter", R.drawable.poni));
         list.add(new HomeModel("Брайан Кребс: криптовымогатель DarkSide не шифрует ПК c русской раскладкой", R.drawable.mini));
         list.add(new HomeModel("Подразделение Google Cloud заключило контракт со SpaceX на использование Starlink", R.drawable.stark));
         list.add(new HomeModel("Intel сделала фотореалистичную графику в GTA V с помощью машинного обучения", R.drawable.car));
         list.add(new HomeModel("thrEat reSearch Camp: большой технический defensive-трек на PHDays", R.drawable.kol));
         list.add(new HomeModel("Менеджеры Amazon: сотрудников приходится нанимать для увольнений, чтобы поддержать текучку", R.drawable.sklad));
    return list;
    }
}