<?php

namespace App\Classes;

class DiceSimilarity{
    public function prosesDice($kunci, $jawaban){
        $kunci = explode(" ", $kunci);
        $jawaban = explode(" ", $jawaban);

        $himpunanA = $this->himpunan($kunci);
        $himpunanB = $this->himpunan($jawaban);

        $irisan = $this->irisan($kunci, $jawaban);

        $dice = ((2*$irisan)/($himpunanA+$himpunanB))*100;

        return $dice;
    }

    private function himpunan($kata) {
        $kataunik = array_unique($kata);
        
        return count($kataunik);
    }

    private function irisan($kunci, $jawaban){
        $kunci = array_values(array_unique($kunci));
        $jawaban = array_values(array_unique($jawaban));
        // print_r($kunci);
        $hasil = 0;
        for ($x=0; $x < count($kunci)  ; $x++) { 
            for ($y=0; $y < count($jawaban) ; $y++) { 
                if($kunci[$x] == $jawaban[$y]){
                    $hasil += 1;
                }
            }
        }
        return $hasil;
    }

    
}

?>