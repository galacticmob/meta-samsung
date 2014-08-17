# Copyright (C) 2014 Armin Kuster.
# Released under the MIT license (see COPYING.MIT for the terms)

include linux-samsung.inc

KBRANCH_samsung-s5pv210 = "v3.17-next/dt-s5pv210"
SRCREV_samsung-s5pv210 ?= "f1ff47454bb2fe0d5644f981679d1bea532816fd"

PV = "3.17+git${SRCPV}"


COMPATIBLE_MACHINE = "samsung-s5pv210"
