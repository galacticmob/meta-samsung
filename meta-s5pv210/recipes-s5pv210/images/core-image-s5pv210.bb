DESCRIPTION = "Samsung s5pv210 Image" 

IMAGE_FEATURES += "splash ssh-server-openssh "

EXTRA_IMAGE_FEATURES += "debug-tweaks dbg-pkgs dev-pkgs staticdev-pkgs"

IMAGE_INSTALL = "packagegroup-core-boot"
IMAGE_INSTALL += "packagegroup-core-full-cmdline"
IMAGE_INSTALL += "packagegroup-core-buildessential"
IMAGE_INSTALL += "packagegroup-core-sam"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"

