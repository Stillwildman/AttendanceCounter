package com.brack.attendancecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageButton btn_male_usa;
    private ImageButton btn_female_usa;
    private ImageButton btn_male_singapore;
    private ImageButton btn_female_singapore;
    private ImageButton btn_male_uk;
    private ImageButton btn_female_uk;
    private ImageButton btn_male_france;
    private ImageButton btn_female_france;
    
    private TextView totalCount_male_usa;
    private TextView totalCount_female_usa;
    private TextView totalCount_male_singapore;
    private TextView totalCount_female_singapore;
    private TextView totalCount_male_uk;
    private TextView totalCount_female_uk;
    private TextView totalCount_male_france;
    private TextView totalCount_female_france;
    
    private TextView count_male_usa;
    private TextView count_female_usa;
    private TextView count_male_singapore;
    private TextView count_female_singapore;
    private TextView count_male_uk;
    private TextView count_female_uk;
    private TextView count_male_france;
    private TextView count_female_france;
    
    private ImageButton btn_minus_male_usa;
    private ImageButton btn_minus_female_usa;
    private ImageButton btn_minus_male_singapore;
    private ImageButton btn_minus_female_singapore;
    private ImageButton btn_minus_male_uk;
    private ImageButton btn_minus_female_uk;
    private ImageButton btn_minus_male_france;
    private ImageButton btn_minus_female_france;

    private int counts_male_usa;
    private int counts_female_usa;
    private int counts_male_singapore;
    private int counts_female_singapore;
    private int counts_male_uk;
    private int counts_female_uk;
    private int counts_male_france;
    private int counts_female_france;

    private TextView text_totalCounts;
    private ImageButton btn_locks;
    private boolean isButtonsEnable;

    private static String textFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        findViews();
        setListener();
        setDefaultValues();
    }

    private void findViews() {
        btn_male_usa = (ImageButton) findViewById(R.id.btn_male_usa);
        btn_female_usa = (ImageButton) findViewById(R.id.btn_female_usa);
        btn_male_singapore = (ImageButton) findViewById(R.id.btn_male_singapore);
        btn_female_singapore = (ImageButton) findViewById(R.id.btn_female_singapore);
        btn_male_uk = (ImageButton) findViewById(R.id.btn_male_uk);
        btn_female_uk = (ImageButton) findViewById(R.id.btn_female_uk);
        btn_male_france = (ImageButton) findViewById(R.id.btn_male_france);
        btn_female_france = (ImageButton) findViewById(R.id.btn_female_france);

        totalCount_male_usa = (TextView) findViewById(R.id.total_count_male_usa);
        totalCount_female_usa = (TextView) findViewById(R.id.total_count_female_usa);
        totalCount_male_singapore = (TextView) findViewById(R.id.total_count_male_singapore);
        totalCount_female_singapore = (TextView) findViewById(R.id.total_count_female_singapore);
        totalCount_male_uk = (TextView) findViewById(R.id.total_count_male_uk);
        totalCount_female_uk = (TextView) findViewById(R.id.total_count_female_uk);
        totalCount_male_france = (TextView) findViewById(R.id.total_count_male_france);
        totalCount_female_france = (TextView) findViewById(R.id.total_count_female_france);

        count_male_usa = (TextView) findViewById(R.id.count_male_usa);
        count_female_usa = (TextView) findViewById(R.id.count_female_usa);
        count_male_singapore = (TextView) findViewById(R.id.count_male_singapore);
        count_female_singapore = (TextView) findViewById(R.id.count_female_singapore);
        count_male_uk = (TextView) findViewById(R.id.count_male_uk);
        count_female_uk = (TextView) findViewById(R.id.count_female_uk);
        count_male_france = (TextView) findViewById(R.id.count_male_france);
        count_female_france = (TextView) findViewById(R.id.count_female_france);

        btn_minus_male_usa = (ImageButton) findViewById(R.id.btn_minus_male_usa);
        btn_minus_female_usa = (ImageButton) findViewById(R.id.btn_minus_female_usa);
        btn_minus_male_singapore = (ImageButton) findViewById(R.id.btn_minus_male_singapore);
        btn_minus_female_singapore = (ImageButton) findViewById(R.id.btn_minus_female_singapore);
        btn_minus_male_uk = (ImageButton) findViewById(R.id.btn_minus_male_uk);
        btn_minus_female_uk = (ImageButton) findViewById(R.id.btn_minus_female_uk);
        btn_minus_male_france = (ImageButton) findViewById(R.id.btn_minus_male_france);
        btn_minus_female_france = (ImageButton) findViewById(R.id.btn_minus_female_france);

        text_totalCounts = (TextView) findViewById(R.id.text_totalCounts);
        btn_locks = (ImageButton) findViewById(R.id.btn_lock);
    }

    private void setListener() {
        btn_male_usa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseMaleUSACounts();
            }
        });

        btn_female_usa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseFemaleUSACounts();
            }
        });

        btn_male_singapore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseMaleSingaporeCounts();
            }
        });

        btn_female_singapore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseFemaleSingaporeCounts();
            }
        });

        btn_male_uk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseMaleUKCounts();
            }
        });

        btn_female_uk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseFemaleUKCounts();
            }
        });

        btn_male_france.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseMaleFranceCounts();
            }
        });

        btn_female_france.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseFemaleFranceCounts();
            }
        });

        btn_minus_male_usa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseMaleUSACounts();
            }
        });

        btn_minus_female_usa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseFemaleUSACounts();
            }
        });

        btn_minus_male_singapore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseMaleSingaporeCounts();
            }
        });

        btn_minus_female_singapore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseFemaleSingaporeCounts();
            }
        });

        btn_minus_male_uk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseMaleUKCounts();
            }
        });

        btn_minus_female_uk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseFemaleUKCounts();
            }
        });

        btn_minus_male_france.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseMaleFranceCounts();
            }
        });

        btn_minus_female_france.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseFemaleFranceCounts();
            }
        });

        btn_locks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isButtonsEnable = !isButtonsEnable;
                setAllButtonEnable(isButtonsEnable);
            }
        });
    }

    private void setDefaultValues() {
        counts_male_usa = SettingManager.getTotalCountMaleUSA();
        counts_female_usa = SettingManager.getTotalCountFemaleUSA();
        counts_male_singapore = SettingManager.getTotalCountMaleSingapore();
        counts_female_singapore = SettingManager.getTotalCountFemaleSingapore();
        counts_male_uk = SettingManager.getTotalCountMaleUK();
        counts_female_uk = SettingManager.getTotalCountFemaleUK();
        counts_male_france = SettingManager.getTotalCountMaleFrance();
        counts_female_france = SettingManager.getTotalCountFemaleFrance();

        totalCount_male_usa.setText(String.valueOf(counts_male_usa));
        totalCount_female_usa.setText(String.valueOf(counts_female_usa));
        totalCount_male_singapore.setText(String.valueOf(counts_male_singapore));
        totalCount_female_singapore.setText(String.valueOf(counts_female_singapore));
        totalCount_male_uk.setText(String.valueOf(counts_male_uk));
        totalCount_female_uk.setText(String.valueOf(counts_female_uk));
        totalCount_male_france.setText(String.valueOf(counts_male_france));
        totalCount_female_france.setText(String.valueOf(counts_female_france));

        if (Utility.isPortrait())
            textFive = "正\n\n";
        else
            textFive = "正\n";

        setMaleUSACounts();
        setFemaleUSACounts();
        setMaleSingaporeCounts();
        setFemaleSingaporeCounts();
        setMaleUKCounts();
        setFemaleUKCounts();
        setMaleFranceCounts();
        setFemaleFranceCounts();

        setTotalCounts();
        isButtonsEnable = SettingManager.getButtonEnable();
        setAllButtonEnable(isButtonsEnable);
    }

    /** USA Male */

    private void increaseMaleUSACounts() {
        counts_male_usa++;
        SettingManager.setTotalCountMaleUSA(counts_male_usa);
        setMaleUSACounts();
        setTotalCounts();
    }

    private void decreaseMaleUSACounts() {
        if (counts_male_usa != 0) {
            counts_male_usa--;
            SettingManager.setTotalCountMaleUSA(counts_male_usa);
            setMaleUSACounts();
            setTotalCounts();
        }
    }

    private void setMaleUSACounts() {
        totalCount_male_usa.setText(String.valueOf(counts_male_usa));
        count_male_usa.setText("");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < counts_male_usa; i++) {
            sb.append("|\t");

            count_male_usa.setText(sb.toString());

            if (Utility.isDivisibleByFive(i + 1)) {
                sb.replace(sb.indexOf("|"), sb.lastIndexOf("\t") + 1, textFive);
                count_male_usa.setText(sb.toString());
            }
        }

        Utility.setTextColorByCount(counts_male_usa, count_male_usa);
    }

    /** USA Female */

    private void increaseFemaleUSACounts() {
        counts_female_usa++;
        SettingManager.setTotalCountFemaleUSA(counts_female_usa);
        setFemaleUSACounts();
        setTotalCounts();
    }

    private void decreaseFemaleUSACounts() {
        if (counts_female_usa != 0) {
            counts_female_usa--;
            SettingManager.setTotalCountFemaleUSA(counts_female_usa);
            setFemaleUSACounts();
            setTotalCounts();
        }
    }

    private void setFemaleUSACounts() {
        totalCount_female_usa.setText(String.valueOf(counts_female_usa));
        count_female_usa.setText("");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < counts_female_usa; i++) {
            sb.append("|\t");

            count_female_usa.setText(sb.toString());

            if (Utility.isDivisibleByFive(i + 1)) {
                sb.replace(sb.indexOf("|"), sb.lastIndexOf("\t") + 1, textFive);
                count_female_usa.setText(sb.toString());
            }
        }

        Utility.setTextColorByCount(counts_female_usa, count_female_usa);
    }

    /** Singapore Male */

    private void increaseMaleSingaporeCounts() {
        counts_male_singapore++;
        SettingManager.setTotalCountMaleSingapore(counts_male_singapore);
        setMaleSingaporeCounts();
        setTotalCounts();
    }

    private void decreaseMaleSingaporeCounts() {
        if (counts_male_singapore != 0) {
            counts_male_singapore--;
            SettingManager.setTotalCountMaleSingapore(counts_male_singapore);
            setMaleSingaporeCounts();
            setTotalCounts();
        }
    }

    private void setMaleSingaporeCounts() {
        totalCount_male_singapore.setText(String.valueOf(counts_male_singapore));
        count_male_singapore.setText("");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < counts_male_singapore; i++) {
            sb.append("|\t");

            count_male_singapore.setText(sb.toString());

            if (Utility.isDivisibleByFive(i + 1)) {
                sb.replace(sb.indexOf("|"), sb.lastIndexOf("\t") + 1, textFive);
                count_male_singapore.setText(sb.toString());
            }
        }

        Utility.setTextColorByCount(counts_male_singapore, count_male_singapore);
    }

    /** Singapore Female */

    private void increaseFemaleSingaporeCounts() {
        counts_female_singapore++;
        SettingManager.setTotalCountFemaleSingapore(counts_female_singapore);
        setFemaleSingaporeCounts();
        setTotalCounts();
    }

    private void decreaseFemaleSingaporeCounts() {
        if (counts_female_singapore != 0) {
            counts_female_singapore--;
            SettingManager.setTotalCountFemaleSingapore(counts_female_singapore);
            setFemaleSingaporeCounts();
            setTotalCounts();
        }
    }

    private void setFemaleSingaporeCounts() {
        totalCount_female_singapore.setText(String.valueOf(counts_female_singapore));
        count_female_singapore.setText("");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < counts_female_singapore; i++) {
            sb.append("|\t");

            count_female_singapore.setText(sb.toString());

            if (Utility.isDivisibleByFive(i + 1)) {
                sb.replace(sb.indexOf("|"), sb.lastIndexOf("\t") + 1, textFive);
                count_female_singapore.setText(sb.toString());
            }
        }

        Utility.setTextColorByCount(counts_female_singapore, count_female_singapore);
    }

    /** UK Male */

    private void increaseMaleUKCounts() {
        counts_male_uk++;
        SettingManager.setTotalCountMaleUK(counts_male_uk);
        setMaleUKCounts();
        setTotalCounts();
    }

    private void decreaseMaleUKCounts() {
        if (counts_male_uk != 0) {
            counts_male_uk--;
            SettingManager.setTotalCountMaleUK(counts_male_uk);
            setMaleUKCounts();
            setTotalCounts();
        }
    }

    private void setMaleUKCounts() {
        totalCount_male_uk.setText(String.valueOf(counts_male_uk));
        count_male_uk.setText("");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < counts_male_uk; i++) {
            sb.append("|\t");

            count_male_uk.setText(sb.toString());

            if (Utility.isDivisibleByFive(i + 1)) {
                sb.replace(sb.indexOf("|"), sb.lastIndexOf("\t") + 1, textFive);
                count_male_uk.setText(sb.toString());
            }
        }

        Utility.setTextColorByCount(counts_male_uk, count_male_uk);
    }
    
    /** UK Female */

    private void increaseFemaleUKCounts() {
        counts_female_uk++;
        SettingManager.setTotalCountFemaleUK(counts_female_uk);
        setFemaleUKCounts();
        setTotalCounts();
    }

    private void decreaseFemaleUKCounts() {
        if (counts_female_uk != 0) {
            counts_female_uk--;
            SettingManager.setTotalCountFemaleUK(counts_female_uk);
            setFemaleUKCounts();
            setTotalCounts();
        }
    }

    private void setFemaleUKCounts() {
        totalCount_female_uk.setText(String.valueOf(counts_female_uk));
        count_female_uk.setText("");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < counts_female_uk; i++) {
            sb.append("|\t");

            count_female_uk.setText(sb.toString());

            if (Utility.isDivisibleByFive(i + 1)) {
                sb.replace(sb.indexOf("|"), sb.lastIndexOf("\t") + 1, textFive);
                count_female_uk.setText(sb.toString());
            }
        }

        Utility.setTextColorByCount(counts_female_uk, count_female_uk);
    }

    /** France Male */

    private void increaseMaleFranceCounts() {
        counts_male_france++;
        SettingManager.setTotalCountMaleFrance(counts_male_france);
        setMaleFranceCounts();
        setTotalCounts();
    }

    private void decreaseMaleFranceCounts() {
        if (counts_male_france != 0) {
            counts_male_france--;
            SettingManager.setTotalCountMaleFrance(counts_male_france);
            setMaleFranceCounts();
            setTotalCounts();
        }
    }

    private void setMaleFranceCounts() {
        totalCount_male_france.setText(String.valueOf(counts_male_france));
        count_male_france.setText("");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < counts_male_france; i++) {
            sb.append("|\t");

            count_male_france.setText(sb.toString());

            if (Utility.isDivisibleByFive(i + 1)) {
                sb.replace(sb.indexOf("|"), sb.lastIndexOf("\t") + 1, textFive);
                count_male_france.setText(sb.toString());
            }
        }

        Utility.setTextColorByCount(counts_male_france, count_male_france);
    }

    /** France Female */

    private void increaseFemaleFranceCounts() {
        counts_female_france++;
        SettingManager.setTotalCountFemaleFrance(counts_female_france);
        setFemaleFranceCounts();
        setTotalCounts();
    }

    private void decreaseFemaleFranceCounts() {
        if (counts_female_france != 0) {
            counts_female_france--;
            SettingManager.setTotalCountFemaleFrance(counts_female_france);
            setFemaleFranceCounts();
            setTotalCounts();
        }
    }

    private void setFemaleFranceCounts() {
        totalCount_female_france.setText(String.valueOf(counts_female_france));
        count_female_france.setText("");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < counts_female_france; i++) {
            sb.append("|\t");

            count_female_france.setText(sb.toString());

            if (Utility.isDivisibleByFive(i + 1)) {
                sb.replace(sb.indexOf("|"), sb.lastIndexOf("\t") + 1, textFive);
                count_female_france.setText(sb.toString());
            }
        }

        Utility.setTextColorByCount(counts_female_france, count_female_france);
    }

    /** Header Functions */

    private void setTotalCounts() {
        int totalCounts = counts_male_usa + counts_female_usa +
                counts_male_singapore + counts_female_singapore +
                counts_male_uk + counts_female_uk +
                counts_male_france + counts_female_france;

        int maleCounts = counts_male_usa + counts_male_singapore + counts_male_uk + counts_male_france;
        int femaleCounts = counts_female_usa + counts_female_singapore + counts_female_uk + counts_female_france;

        if (Utility.isPortrait())
            text_totalCounts.setText(getString(R.string.total_counts, totalCounts, maleCounts, femaleCounts));
        else
            text_totalCounts.setText(getString(R.string.total_counts_land, totalCounts, maleCounts, femaleCounts));
    }

    private void setAllButtonEnable(boolean enable) {
        btn_male_usa.setEnabled(enable);
        btn_female_usa.setEnabled(enable);
        btn_male_singapore.setEnabled(enable);
        btn_female_singapore.setEnabled(enable);
        btn_male_uk.setEnabled(enable);
        btn_female_uk.setEnabled(enable);
        btn_male_france.setEnabled(enable);
        btn_female_france.setEnabled(enable);

        btn_minus_male_usa.setEnabled(enable);
        btn_minus_female_usa.setEnabled(enable);
        btn_minus_male_singapore.setEnabled(enable);
        btn_minus_female_singapore.setEnabled(enable);
        btn_minus_male_uk.setEnabled(enable);
        btn_minus_female_uk.setEnabled(enable);
        btn_minus_male_france.setEnabled(enable);
        btn_minus_female_france.setEnabled(enable);

        if (enable) {
            btn_locks.setImageResource(R.drawable.ic_lock_on);
            SettingManager.setButtonEnable(true);
        }
        else {
            btn_locks.setImageResource(R.drawable.ic_lock_off);
            SettingManager.setButtonEnable(false);
        }
    }
}
