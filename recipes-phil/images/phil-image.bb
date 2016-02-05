SUMMARY = "Phil's embedded linux image"

IMAGE_INSTALL += "packagegroup-core-boot"
IMAGE_INSTALL += "${ROOTFS_PKGMANAGE_BOOTSTRAP}"
IMAGE_INSTALL += "${CORE_IMAGE_EXTRA_INSTALL}"
IMAGE_INSTALL += "mtd-utils"
IMAGE_INSTALL += "chrony"
IMAGE_INSTALL += "zeromq"
IMAGE_INSTALL += "monkey"
IMAGE_INSTALL += "python-numpy"
IMAGE_INSTALL += "cronie"
IMAGE_INSTALL += "protobuf"
IMAGE_INSTALL += "fftwf"
IMAGE_INSTALL += "cppunit"
IMAGE_INSTALL += "cmake"
IMAGE_INSTALL += "git"
IMAGE_INSTALL += "gdb"
IMAGE_INSTALL += "rsync"
IMAGE_INSTALL += "boost"
IMAGE_INSTALL += "libmodbus"

IMAGE_FEATURES += "ssh-server-dropbear"
IMAGE_FEATURES += "dev-pkgs"
IMAGE_FEATURES += "tools-sdk"
IMAGE_FEATURES += "nfs-server"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image

IMAGE_ROOTFS_SIZE ?= "8192"

