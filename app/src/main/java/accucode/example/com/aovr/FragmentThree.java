//package accucode.example.com.aovr;
//
//import android.os.Bundle;
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//
//public class FragmentThree extends Fragment implements View.OnClickListener {
//    Button btnRestart;
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // TODO Auto-generated method stub
//        View myView = inflater.inflate(R.layout.fragment_three_layout, container, false);
//        btnRestart = (Button) myView.findViewById(R.id.btnRestart);
//        btnRestart.setOnClickListener(this);
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
//                .replace(R.id.content_frame2, fragment)
//                .commit();
//    }
//}
////        getActivity().getFragmentManager().beginTransaction().remove(accucode.example.com.aovr.FragmentThree).commit();
