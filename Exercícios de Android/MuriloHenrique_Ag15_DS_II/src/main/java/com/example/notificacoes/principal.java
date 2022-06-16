package com.example.notificacoes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNotificar1Prog = (Button) findViewById(R.id.notificarbtn);
        Button btnNotificar2Prog = (Button) findViewById(R.id.notificarbtn2);

        btnNotificar1Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String mensagem = "50% de desconto.";
                String titulo = "Promoção!";
                notificarUsuario(mensagem, titulo);
            }


            public void notificarUsuario(String mensagem, String titulo){


                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    CharSequence nome = "promocao";
                    String descricao = "promocao";

                    int importancia = NotificationManager.IMPORTANCE_DEFAULT;
                    NotificationChannel channel = new NotificationChannel("9000", nome, importancia);
                    channel.setDescription(descricao);

                    NotificationCompat.Builder notificacao = new
                            NotificationCompat.Builder(getBaseContext(),"9000");

                    notificacao.setContentTitle(titulo);

                    notificacao.setContentText(mensagem);

                    notificacao.setSmallIcon(R.drawable.ic_launcher_foreground);

                    notificacao.setAutoCancel(true);


                    Intent it = new Intent(getBaseContext(), Promocao.class);


                    PendingIntent pit =
                            PendingIntent.getActivity(getBaseContext(), 100, it, PendingIntent.FLAG_UPDATE_CURRENT);


                    notificacao.setContentIntent(pit);

                    NotificationManager notificar = getSystemService(NotificationManager.class);

                    notificar.createNotificationChannel(channel);

                    notificar.notify(9000, notificacao.build());
                }
                else {

                    NotificationCompat.Builder notificacao = new NotificationCompat.Builder(getBaseContext());

                    notificacao.setContentTitle(titulo);

                    notificacao.setContentText(mensagem);

                    notificacao.setPriority(Notification.PRIORITY_HIGH);

                    notificacao.setSmallIcon(R.drawable.ic_launcher_foreground);

                    notificacao.setAutoCancel(true);


                    Intent it = new Intent(getBaseContext(), Promocao.class);


                    PendingIntent pit = PendingIntent.getActivity(getBaseContext(), 100, it, PendingIntent.FLAG_UPDATE_CURRENT);

                    notificacao.setContentIntent(pit);

                    NotificationManager notificar = (NotificationManager) getBaseContext().getSystemService(Context.NOTIFICATION_SERVICE);


                    notificar.notify(9000, notificacao.build());



                }
            }
        });
        btnNotificar2Prog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String mensagem = "50% de desconto.";
                String titulo = "Aproveite essa Promoção!";
                notificarUsuario2(mensagem, titulo);
            }


            public void notificarUsuario2(String mensagem, String titulo){


                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    CharSequence nome = "promocao";
                    String descricao = "promocao";

                    int importancia = NotificationManager.IMPORTANCE_DEFAULT;
                    NotificationChannel channel = new NotificationChannel("9001", nome, importancia);
                    channel.setDescription(descricao);

                    NotificationCompat.Builder notificacao = new NotificationCompat.Builder(getBaseContext(),"9001");

                    notificacao.setContentTitle(titulo);

                    notificacao.setContentText(mensagem);

                    notificacao.setSmallIcon(R.drawable.ic_launcher_foreground);

                    notificacao.setAutoCancel(true);


                    Intent it = new Intent(getBaseContext(), Promocao2.class);


                    PendingIntent pit =
                            PendingIntent.getActivity(getBaseContext(), 100, it, PendingIntent.FLAG_UPDATE_CURRENT);


                    notificacao.setContentIntent(pit);

                    NotificationManager notificar = getSystemService(NotificationManager.class);

                    notificar.createNotificationChannel(channel);

                    notificar.notify(9001, notificacao.build());
                }
                else {

                    NotificationCompat.Builder notificacao = new NotificationCompat.Builder(getBaseContext());

                    notificacao.setContentTitle(titulo);

                    notificacao.setContentText(mensagem);

                    notificacao.setPriority(Notification.PRIORITY_HIGH);

                    notificacao.setSmallIcon(R.drawable.ic_launcher_foreground);

                    notificacao.setAutoCancel(true);


                    Intent it = new Intent(getBaseContext(), Promocao2.class);


                    PendingIntent pit = PendingIntent.getActivity(getBaseContext(), 100, it, PendingIntent.FLAG_UPDATE_CURRENT);

                    notificacao.setContentIntent(pit);

                    NotificationManager notificar = (NotificationManager) getBaseContext().getSystemService(Context.NOTIFICATION_SERVICE);

                    notificar.notify(9001, notificacao.build());
                }
            }
        });
    }
}
