# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The main purpose of the cob_twist_controller is to convert target twists into joint velocities.    Therefore it makes use of several implemented inverse kinematics approaches at the first order differential level.    The inverse differential kinematics solver considers kinematic chain extensions, singularity robustness,    redundancy resolution and priority-based methods.   To avoid hardware destruction there is a limiter interface active as well.    Via parameter server users can dynamically configure the solving strategy."
AUTHOR = "Felix Messmer <felixmessmer@gmail.com>"
ROS_AUTHOR = "Felix Messmer <fxm@ipa.fhg.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_control"
ROS_BPN = "cob_twist_controller"

ROS_BUILD_DEPENDS = " \
    ${PYTHON_PN}-six \
    boost \
    cmake-modules \
    cob-control-msgs \
    cob-srvs \
    dynamic-reconfigure \
    eigen-conversions \
    geometry-msgs \
    kdl-conversions \
    kdl-parser \
    libeigen \
    nav-msgs \
    orocos-kdl \
    pluginlib \
    roscpp \
    roslint \
    sensor-msgs \
    std-msgs \
    tf \
    tf-conversions \
    trajectory-msgs \
    urdf \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${PYTHON_PN}-six \
    boost \
    cmake-modules \
    cob-control-msgs \
    cob-srvs \
    dynamic-reconfigure \
    eigen-conversions \
    geometry-msgs \
    kdl-conversions \
    kdl-parser \
    libeigen \
    nav-msgs \
    orocos-kdl \
    pluginlib \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    tf-conversions \
    trajectory-msgs \
    urdf \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${PYTHON_PN}-matplotlib \
    ${PYTHON_PN}-six \
    boost \
    cmake-modules \
    cob-control-msgs \
    cob-frame-tracker \
    cob-script-server \
    cob-srvs \
    dynamic-reconfigure \
    eigen-conversions \
    geometry-msgs \
    kdl-conversions \
    kdl-parser \
    libeigen \
    nav-msgs \
    orocos-kdl \
    pluginlib \
    robot-state-publisher \
    roscpp \
    rospy \
    rviz \
    sensor-msgs \
    std-msgs \
    tf \
    tf-conversions \
    topic-tools \
    trajectory-msgs \
    urdf \
    visualization-msgs \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa320/cob_control-release/archive/release/melodic/cob_twist_controller/0.8.11-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/cob_twist_controller"
SRC_URI = "git://github.com/ipa320/cob_control-release;${ROS_BRANCH};protocol=https"
SRCREV = "5cb71bd62153b3f0ba7acba0b601e80134b57068"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
