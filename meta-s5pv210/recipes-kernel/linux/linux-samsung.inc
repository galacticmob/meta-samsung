# Copyright (C) 2014 Armin Kuster.
# Released under the MIT license (see COPYING.MIT for the terms)

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"
DEPENDS += "lzop-native bc-native"
PROVIDES = "virtual/kernel linux-mainline"

inherit kernel

LOCALVERSION = "-samsung"
KBRANCH ?= ""

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/kgene/linux-samsung.git;branch=${KBRANCH} \
           file://defconfig"

S = "${WORKDIR}/git"

