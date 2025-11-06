inherit core-image

require recipes-images/images/core-image-full-cmdline.bb

# Dodanie pakietów wymaganych do obrazu
IMAGE_INSTALL:append = " \
    networkmanager \
    systemd-serialgetty \
"

# Dodanie cech obrazu (np. SSH server)
IMAGE_FEATURES += " ssh-server-dropbear"

