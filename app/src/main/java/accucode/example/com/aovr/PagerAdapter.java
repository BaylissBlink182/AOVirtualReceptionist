package accucode.example.com.aovr;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



public class PagerAdapter extends FragmentPagerAdapter {

    public PagerAdapter(FragmentManager fm) {
        super(fm);

    }

    @Override
    public Fragment getItem(int arg0) {

        switch (arg0) {
            case 0:

//                return new FragmentOne();
//            case 1:
//                return new FragmentTwo();
//            case 2:
//                return new FragmentThree();

            default:
                break;
        }
        return null;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 2;
    }


}