//package accucode.example.com.aovr;
//
//import android.os.Bundle;
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//import android.widget.RelativeLayout;
//
//public class FragmentOne extends Fragment implements View.OnClickListener {
//
//    Button btnTransfer;
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//
//
////        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
////                RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
////        params.addRule(RelativeLayout.RIGHT_OF, .getId());
//
//        View myView = inflater.inflate(R.layout.fragment_one_layout, container, false);
//        btnTransfer = (Button) myView.findViewById(R.id.btnTransfer);
//        btnTransfer.setOnClickListener(this);
//        return myView;
//
////        public void onClick(View v) {
//
//
////        return inflater.inflate(R.layout.fragment_two_layout,container,false);
//    }
//
//    @Override
//    public void onClick(View v) {
//
//        Fragment fragment = new FragmentTwo();
//// Insert the fragment by replacing any existing fragment
//        FragmentManager fragmentManager = getFragmentManager();
//        fragmentManager.beginTransaction()
//                .replace(R.id.activity1, fragment)
//                .commit();
//    }
//}
//
//
//
//
//
