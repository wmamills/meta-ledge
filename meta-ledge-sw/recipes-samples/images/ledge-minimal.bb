SUMMARY = "Minimal image"

LICENSE = "MIT"

inherit core-image distro_features_check extrausers

# let's make sure we have a good image..
REQUIRED_DISTRO_FEATURES = "pam systemd"

CORE_IMAGE_BASE_INSTALL += " \
    kernel-modules \
    kernel-devicetree \
    "

EXTRA_USERS_PARAMS = "\
    useradd -p '' ledge; \
    "
