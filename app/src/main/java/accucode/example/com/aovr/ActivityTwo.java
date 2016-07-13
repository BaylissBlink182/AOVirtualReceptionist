package accucode.example.com.aovr;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.Toast;

import java.util.Properties;

//import javax.mail.*;
//import javax.mail.internet.*;


/**
 * Created by bcarr on 7/8/2016.
 */
public class ActivityTwo extends Activity implements OnClickListener{

//    Button btnNotifyPerson =(Button)findViewById(R.id.btnNotifyPerson);

    String[] emailList = { "A. J. Love", "Aaron Ledbetter","Allen Ewert", "Andrew Bristol","Andrew Sager","Artie Moskowitz","Bayliss Carr",
    "Bob Bloom","Brandon Grant","Bryant Delaney","Chad Haynes","Chantal Maestas","Charlie Fedorko","Chris Barr","Connor Price","David Gardner",
    "Dawn Wilson","Don Everett", "Ed Pietzsch","Eric Reed","George Vrontas","Heather Williams","Jeffrey Carlson","Jenna Ricci",
    "Jenny Schillinger","Jim Schneider","John Arenas","Kevin Hughes","Kevin Horgan","Kevin Price","Kevin Reynolds","Kristine Semanic",
            "Laura Pietzsch","Mark Hagger","Mark Lentell","Mark Yantis","Matthew Didier","Meaghan McCormick","Michael Minter","Mike Kleinberg",
            "Morgan Deppe","Nicholas Barr","Nicole Schottleutner","Paul McMahon","Peter Abplanalp","Ray Head","Ryan Eger","Ryan Waxler","Sandy Deskin",
            "Stephanie Wagner","Steve Gundersen","Steven Meister","Teppei Masaki","Travis Plakke","Wyatt Love"
    };
    Button btnNotifyPerson;
//    ArrayAdapter adapter;


@Override
        public void onClick(View view) {
}

//



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_two_layout);



//        final String username = "bcarr@accucode.com";
//        final String password = "Lilylucy5!";
//
//        Properties props = new Properties();
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.port", "587");
//
//        Session session = Session.getInstance(props,
//                new javax.mail.Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(username, password);
//                    }
//                });
//        try
//        {
//            Message message = new MimeMessage(session);
//
//            message.setFrom(new InternetAddress("bcarr@accucode.com"));
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("bcarr@accucode.com"));
//            message.addRecipient(Message.RecipientType.CC, new InternetAddress("CC address here..."));
//            message.setSubject("Subject here...");
//
//            StringBuilder htmlMessageBuilder = new StringBuilder();
//
//            htmlMessageBuilder.append("HTML in here...this is for html message body");
//
//            message.setText("Non-html message body here");
//
//            message.setContent(htmlMessageBuilder.toString(), "text/html");
//
//            Transport.send(message);
//
////            out.println("Email sent successfully!");
//        }
//        catch (MessagingException e)
//        {
////            out.println("Error sending email.");
//        }


//        BackgroundMail bm = new BackgroundMail(context);
//        bm.setGmailUserName("yourgmail@gmail.com");
//        bm.setGmailPassword("yourgmailpassword");
//        bm.setMailTo("receiver@gmail.com");
//        bm.setFormSubject("Subject");
//        bm.setFormBody("Body");
//        bm.send();

        //Called when the activity is created.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_singlechoice, emailList);
        //Find TextView control
        final AutoCompleteTextView acTextView = (AutoCompleteTextView) findViewById(R.id.emailACList);
        acTextView.setOnClickListener(this);

        //Set the number of characters the user must type before the drop down list is shown
        acTextView.setThreshold(1);
        //Set the adapter
        acTextView.setAdapter(adapter);

        acTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
                    public void onItemClick(AdapterView<?> arg0, View arg1,
                                            int arg2, long arg3){
                Toast.makeText(ActivityTwo.this, "You have selected: " + (CharSequence)arg0.getItemAtPosition(arg2), Toast.LENGTH_LONG).show();

                if((CharSequence)arg0.getItemAtPosition(arg2) == "A. J. Love"){
//                    Toast.makeText(ActivityTwo.this, "You have CHOSEN " + (CharSequence)arg0.getItemAtPosition(arg2), Toast.LENGTH_LONG).show();

//                    Intent i = new Intent(Intent.ACTION_SEND);
//                    i.setType("message/rfc822");
//                    i.putExtra(Intent.EXTRA_EMAIL, new String[]{"bcarr@accucode.com"});
//                    i.putExtra(Intent.EXTRA_SUBJECT, "subject of email");
//                    i.putExtra(Intent.EXTRA_TEXT, "body of email");



//                    View view = this.getCurrentFocus();
//                    if (view != null) {
//                        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
//                        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
//                    }

////                    try {
//                        startActivity(Intent.createChooser(i, "Send mail..."));
//
//
//                        Toast.makeText(ActivityTwo.this, "You have notified: " + (CharSequence)arg0.getItemAtPosition(arg2), Toast.LENGTH_LONG).show();
//
//////                        if (arg0 != null) {
//                            InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
//                            imm.hideSoftInputFromWindow(arg1.getWindowToken(), 0);
//                        }
//                    } catch (android.content.ActivityNotFoundException ex) {
//                        Toast.makeText(ActivityTwo.this, "There was an Error!", Toast.LENGTH_SHORT).show();
                }

            }
                                      });

        //btn OnClick email switch ativiity
        btnNotifyPerson=(Button)findViewById(R.id.btnNotifyPerson);
//        btnNotifyPerson.setBackgroundColor(Color.TRANSPARENT);
        btnNotifyPerson.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
//
//                Mail m = new Mail("bcarr@accucode.com", "Lilylucy5!");
//
//                String[] toArr = {"bcarr@accucode.com", "abristol@accucode.com"};
//                m.setTo(toArr);
//                m.setFrom("bcarr@accucode.com");
//                m.setSubject("This is an email sent using my Mail JavaMail wrapper from an Android device.");
//                m.setBody("Email body.");
//
//                try {
////                    m.addAttachment("/sdcard/filelocation");
//
//                    if(m.send()) {
//                        Toast.makeText(ActivityTwo.this, "Email was sent successfully.", Toast.LENGTH_LONG).show();
//                    } else {
//                        Toast.makeText(ActivityTwo.this, "Email was not sent.", Toast.LENGTH_LONG).show();
//                    }
//                } catch(Exception e) {
//                    Toast.makeText(ActivityTwo.this, "There was a problem sending the email.", Toast.LENGTH_LONG).show();
//                    Log.e("MailApp", "Could not send email", e);
//                }
            }
        });
    }

    }




//                try {
//                    GMailSender sender = new GMailSender("bcarr@gmail.com", "Lilylucy5!");
//                    sender.sendMail("This is Subject",
//                            "This is Body",
//                            "bcarr@gmail.com",
//                            "abristol@gmail.com");
//                } catch (Exception e) {
//                    Log.e("SendMail", e.getMessage(), e);
//                }

//                Intent i = new Intent(Intent.ACTION_SEND);
//                i.setType("message/rfc822");
//                i.putExtra(Intent.EXTRA_EMAIL, new String[]{"bcarr@accucode.com"});
//                i.putExtra(Intent.EXTRA_SUBJECT, "subject of email");
//                i.putExtra(Intent.EXTRA_TEXT, "body of email");
//
//                    startActivity(Intent.createChooser(i, "Send mail..."));
//
//                Intent my2Intent = new Intent(ActivityTwo.this, ActivityThreee.class);
//                startActivity(my2Intent);

