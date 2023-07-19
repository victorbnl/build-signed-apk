# Build signed APK

Build a signed APK of your Android application

> **Warning**  
> This action only works on Ubuntu

## Inputs

### Either required

- `keystore_b64`: The _contents of_ the keystore file (.jks), encoded as base64. You can generate it on Linux by running `base64 keystore.jks`.

- `keystore_file`: The path to the keystore file (.jks). Using it is a security issue as it requires to have your keystore file in your repository. Instead please use `keystore_b64`, which allows you to have your keystore as a GitHub secret.

### Required

- `keystore_password`: Your keystore’s password.

- `key_alias`: Your key’s alias.

- `key_password`: Your key’s password.

### Optionnal

- `gradlew_dir`: Gradlew file directory (default: `.`).

- `java_version`: Java version to use (can be `8`, `11` or `17`; default: `11`).

## Example

```yaml
- name: Build Signed APK
  uses: victorbnl/build-signed-apk@main
  with:
    keystore_b64: ${{ secrets.keystore }}
    keystore_password: ${{ secrets.keystore_password }}
    key_alias: ${{ secrets.key_alias }}
    key_password: ${{ secrets.key_password }}
```

## Get your APK

The APK is built at the default location, that is: `app/build/outputs/apk/release/app-release.apk`.

Now you can do what you want with the APK file, like creating a release or uploading it as an artifact.
