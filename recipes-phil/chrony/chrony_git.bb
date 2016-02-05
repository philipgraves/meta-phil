SUMMARY = "Chrony time synchronization"
HOMEPAGE = ""
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS += "readline"
REDEPENDS += "readline"

SRCREV="2afdd4544deaa1b9873af6ef2407f156ec26b1cc"
PV = "1.29+git${SRCREV}"
SRC_URI = "git://git.tuxfamily.org/gitroot/chrony/chrony.git"

S = "${WORKDIR}/git"

do_configure() {
	${S}/configure
}

do_compile() {
	unset CPPFLAGS
	oe_runmake
}

do_install() {
	install -d ${D}${bindir}
	install -m 0644 chronyd ${D}${bindir}
	install -m 0644 chronyc ${D}${bindir}
}

