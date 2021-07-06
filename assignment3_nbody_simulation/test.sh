#!/bin/bash

run_test() {
    local sim_duration="$1"
    local time_step="$2"
    local input_filepath="$3"
    local expected="$4"

    local cmdstr="java \
-classpath /home/tristan/Documents/dev/code/cos126:/usr/local/lift/lib/algs4.jar:/usr/local/lift/lib/stdlib.jar \
assignment3_nbody_simulation.NBody $sim_duration $time_step true \
< $input_filepath"

    local actual=$(eval $cmdstr) > /dev/null

    if [[ $expected == $actual ]]; then
        printf "SUCCESS:\n$cmdstr\n"
    else
        printf "FAIL:\n$cmdstr\nExpected:\n$expected\nActual:\n$actual\n"
    fi
}

expected="5
2.50e+11
 1.4960e+11  0.0000e+00  0.0000e+00  2.9800e+04  5.9740e+24    data/earth.gif
 2.2790e+11  0.0000e+00  0.0000e+00  2.4100e+04  6.4190e+23     data/mars.gif
 5.7900e+10  0.0000e+00  0.0000e+00  4.7900e+04  3.3020e+23  data/mercury.gif
 0.0000e+00  0.0000e+00  0.0000e+00  0.0000e+00  1.9890e+30      data/sun.gif
 1.0820e+11  0.0000e+00  0.0000e+00  3.5000e+04  4.8690e+24    data/venus.gif"

run_test "0.0" "25000.0" "data/planets.txt" "$expected"

expected="5
2.50e+11
 1.4960e+11  7.4500e+08 -1.4820e+02  2.9800e+04  5.9740e+24    data/earth.gif
 2.2790e+11  6.0250e+08 -6.3860e+01  2.4100e+04  6.4190e+23     data/mars.gif
 5.7875e+10  1.1975e+09 -9.8933e+02  4.7900e+04  3.3020e+23  data/mercury.gif
 3.3087e+01  0.0000e+00  1.3235e-03  0.0000e+00  1.9890e+30      data/sun.gif
 1.0819e+11  8.7500e+08 -2.8329e+02  3.5000e+04  4.8690e+24    data/venus.gif"

run_test "25000.0" "25000.0" "data/planets.txt" "$expected"

expected="5
2.50e+11
 1.4959e+11  1.4900e+09 -2.9640e+02  2.9799e+04  5.9740e+24    data/earth.gif
 2.2790e+11  1.2050e+09 -1.2772e+02  2.4100e+04  6.4190e+23     data/mars.gif
 5.7826e+10  2.3945e+09 -1.9789e+03  4.7880e+04  3.3020e+23  data/mercury.gif
 9.9262e+01  2.8198e-01  2.6470e-03  1.1279e-05  1.9890e+30      data/sun.gif
 1.0818e+11  1.7499e+09 -5.6660e+02  3.4998e+04  4.8690e+24    data/venus.gif"

run_test "50000.0" "25000.0" "data/planets.txt" "$expected"

expected="5
2.50e+11
 1.4958e+11  2.2349e+09 -4.4460e+02  2.9798e+04  5.9740e+24    data/earth.gif
 2.2789e+11  1.8075e+09 -1.9158e+02  2.4099e+04  6.4190e+23     data/mars.gif
 5.7752e+10  3.5905e+09 -2.9682e+03  4.7839e+04  3.3020e+23  data/mercury.gif
 1.9852e+02  1.1280e+00  3.9705e-03  3.3841e-05  1.9890e+30      data/sun.gif
 1.0816e+11  2.6248e+09 -8.4989e+02  3.4993e+04  4.8690e+24    data/venus.gif"

run_test "60000.0" "25000.0" "data/planets.txt" "$expected"

expected="5
2.50e+11
 1.4959e+11 -1.6531e+09  3.2949e+02  2.9798e+04  5.9740e+24    data/earth.gif
-2.2153e+11 -4.9263e+10  5.1805e+03 -2.3640e+04  6.4190e+23     data/mars.gif
 3.4771e+10  4.5752e+10 -3.8269e+04  2.9415e+04  3.3020e+23  data/mercury.gif
 5.9426e+05  6.2357e+06 -5.8569e-02  1.6285e-01  1.9890e+30      data/sun.gif
-7.3731e+10 -7.9391e+10  2.5433e+04 -2.3973e+04  4.8690e+24    data/venus.gif"

run_test "31557600.0" "25000.0" "data/planets.txt" "$expected"

expected="3
1.25e+11
 2.1470e+12 -7.8082e-03  5.0000e+02 -3.6368e-12  5.9740e+24    data/earth.gif
 1.2882e+14 -1.5100e+17  3.0000e+04 -3.5165e+07  1.9890e+30      data/sun.gif
-1.2882e+14  1.5100e+17 -3.0000e+04  3.5165e+07  1.9890e+30      data/sun.gif"

run_test "4.294E9" "2.147E9" "data/3body.txt" "$expected"
