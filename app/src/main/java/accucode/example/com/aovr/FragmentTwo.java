//package accucode.example.com.aovr;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.Toast;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//
//public class FragmentTwo extends Activity implements View.OnClickListener {
//    Button btnNotify;
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//
//        View myView = inflater.inflate(R.layout.fragment_two_layout, container, false);
//        btnNotify = (Button) myView.findViewById(R.id.btnNotifyPerson);
//        btnNotify.setOnClickListener(this);
//        return myView;
//
////        public void onClick(View v) {
//
//
////        return inflater.inflate(R.layout.fragment_two_layout,container,false);
//    }
//    @Override
//    public void onClick(View v) {
////
////        Fragment fragment = new FragmentThree();
////// Insert the fragment by replacing any existing fragment
////        FragmentManager fragmentManager = getFragmentManager();
////        fragmentManager.beginTransaction()
////                .replace(R.id.content_frame2, fragment)
////                .commit();
////        getActivity().getFragmentManager().beginTransaction().remove(accucode.example.com.aovr.FragmentThree).commit();
//
////        @Override
////        public View onCreateView(LayoutInflater inflater, ViewGroup container,
////                Bundle savedInstanceState) {
////            View rootView = inflater.inflate(R.layout.about_screeen, container, false);
////            return rootView;
//        }
//
//
//
////        LayoutInflater inflater = LayoutInflater.from(MainActivity.this);
////        View theInflatedView = inflater.inflate(R.layout.fragment_two_layout, null); // 2 and 3
//    }
//
//
////    Button btnSendSMS = (Button) findViewById(R.id.btnSendEmail);
////    btnSendSMS.setOnClickListener(new View.OnClickListener() {
////        public void onClick(View v) {
////
////            Intent i = new Intent(Intent.ACTION_SEND);
////            i.setType("message/rfc822");
////            i.putExtra(Intent.EXTRA_EMAIL, new String[]{"bcarr@accucode.com"});
////            i.putExtra(Intent.EXTRA_SUBJECT, "subject of email");
////            i.putExtra(Intent.EXTRA_TEXT, "body of email");
////            try {
////                startActivity(Intent.createChooser(i, "Send mail..."));
////            } catch (android.content.ActivityNotFoundException ex) {
////                Toast.makeText(MainActivity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
////            }
////        }
////
////    });
//
