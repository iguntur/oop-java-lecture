{ pkgs, lib, config, inputs, ... }:

{
  languages.java = {
    enable = true;
    jdk.package = pkgs.jdk17;
  };
}
