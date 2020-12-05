# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "libqt-concurrent metapackage supporting qt4 and qt5"
AUTHOR = "Matthew Bries <mbries@swri.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "United-States-Government-Purpose & SwRI-Proprietary"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=8e473b26ead33548c945bdaca143a08d"

ROS_CN = "qt_metapackages"
ROS_BPN = "libqt_concurrent"

ROS_BUILD_DEPENDS = " \
    qtbase \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    qtbase \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    qtbase \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/swri-robotics-gbp/qt_metapackages-release/archive/release/melodic/libqt_concurrent/1.0.1-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/libqt_concurrent"
SRC_URI = "git://github.com/swri-robotics-gbp/qt_metapackages-release;${ROS_BRANCH};protocol=https"
SRCREV = "4831d1368f0f387d303df55c8195898965731324"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
