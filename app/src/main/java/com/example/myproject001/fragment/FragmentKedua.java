package com.example.myproject001.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.ToggleButton;

import com.example.myproject001.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentKedua#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentKedua extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentKedua() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentKedua.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentKedua newInstance(String param1, String param2) {
        FragmentKedua fragment = new FragmentKedua();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_kedua, container, false);

        // Inflate layout fragment
        View view = inflater.inflate(R.layout.fragment_kedua, container, false);


        // 1. INIT
        EditText edtPelanggan = view.findViewById(R.id.edtPelanggan);
        EditText edtBerat = view.findViewById(R.id.edtBerat);

        ToggleButton toggleStatusBayar = view.findViewById(R.id.toggleStatusBayar);

        CheckBox cuciSetrika = view.findViewById(R.id.cuciSetrika);
        CheckBox cuciSaja = view.findViewById(R.id.cuciSaja);
        CheckBox setrikaSaja = view.findViewById(R.id.setrikaSaja);

        Switch switchAntarJemput = view.findViewById(R.id.switchAntarJemput);

        RadioGroup radioLayanan = view.findViewById(R.id.radioLayanan);

        TimePicker timePicker = view.findViewById(R.id.timePicker);
        DatePicker datePicker = view.findViewById(R.id.datePicker);

        Button btnSubmit = view.findViewById(R.id.btnSubmit);
        TextView tvOutput = view.findViewById(R.id.tvOutput);



        // 2. BUTTON SUBMIT
         btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nama = edtPelanggan.getText().toString();
                String berat = edtBerat.getText().toString();

                String statusBayar = toggleStatusBayar.isChecked()
                        ? "Sudah Bayar"
                        : "Belum Bayar";

                // Checkbox
                String layanan = "";
                if (cuciSetrika.isChecked()) layanan += "Cuci Setrika, ";
                if (cuciSaja.isChecked()) layanan += "Cuci Saja, ";
                if (setrikaSaja.isChecked()) layanan += "Setrika Saja, ";

                if (layanan.isEmpty()) layanan = "Tidak ada";
                else layanan = layanan.substring(0, layanan.length() - 2);

                // Switch
                String antarJemput = switchAntarJemput.isChecked()
                        ? "Ya"
                        : "Tidak";

                // RadioGroup
                int selectedId = radioLayanan.getCheckedRadioButtonId();
                RadioButton rb = view.findViewById(selectedId);
                String jenisLayanan = (rb != null) ? rb.getText().toString() : "Belum dipilih";

                // TimePicker
                int jam = timePicker.getHour();
                int menit = timePicker.getMinute();

                // DatePicker
                int hari = datePicker.getDayOfMonth();
                int bulan = datePicker.getMonth() + 1;
                int tahun = datePicker.getYear();

                // Output
                String hasil = "=== RINCIAN PESANAN ===\n"
                        + "Nama Pelanggan : " + nama + "\n"
                        + "Berat Cucian   : " + berat + " kg\n"
                        + "Status Bayar   : " + statusBayar + "\n"
                        + "Layanan        : " + layanan + "\n"
                        + "Antar Jemput   : " + antarJemput + "\n"
                        + "Jenis Layanan  : " + jenisLayanan + "\n"
                        + "Waktu Ambil    : " + jam + ":" + menit + "\n"
                        + "Tanggal Ambil  : " + hari + "-" + bulan + "-" + tahun;

                tvOutput.setText(hasil);
            }
        });

        return view;

    }

}