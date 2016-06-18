union () {
  translate ([0, 0, -1]) {
    color ([1, 0, 1, ]) {
      cube ([200, 200, 1], center=true);
    }
  }
  union () {
    translate ([0, 0, 2]) {
      color ([0, 1, 1, ]) {
        cube ([71.75, 38.75, 4], center=true);
      }
    }
    translate ([0, 0, 6]) {
      color ([1, 1, 1, ]) {
        cube ([74, 39, 8], center=true);
      }
    }
  }
  union () {
    translate ([37.75, 0, 0]) {
      union () {
        translate ([1.5, 0, 30.5]) {
          rotate ([90.0,0.0,0.0]) {
            color ([0, 1, 0, ]) {
              cube ([1.5, 5.5, 39], center=true);
            }
          }
        }
        translate ([1.5, 0, 7.75]) {
          rotate ([90.0,0.0,0.0]) {
            color ([0, 1, 0, ]) {
              cube ([1.5, 5.5, 39], center=true);
            }
          }
        }
        translate ([0, 39/2, 18]) {
          color ([0, 0, 1, ]) {
            cube ([1.5, 7.25, 36], center=true);
          }
        }
        translate ([0, -39/2, 18]) {
          color ([0, 0, 1, ]) {
            cube ([1.5, 7.25, 36], center=true);
          }
        }
      }
    }
    translate ([-37.75, 0, 0]) {
      rotate ([0.0,0.0,180.0]) {
        union () {
          translate ([1.5, 0, 30.5]) {
            rotate ([90.0,0.0,0.0]) {
              color ([0, 1, 0, ]) {
                cube ([1.5, 5.5, 39], center=true);
              }
            }
          }
          translate ([1.5, 0, 7.75]) {
            rotate ([90.0,0.0,0.0]) {
              color ([0, 1, 0, ]) {
                cube ([1.5, 5.5, 39], center=true);
              }
            }
          }
          translate ([0, 39/2, 18]) {
            color ([0, 0, 1, ]) {
              cube ([1.5, 7.25, 36], center=true);
            }
          }
          translate ([0, -39/2, 18]) {
            color ([0, 0, 1, ]) {
              cube ([1.5, 7.25, 36], center=true);
            }
          }
        }
      }
    }
    translate ([0, -41/2, 13.75]) {
      rotate ([90.0,0.0,90.0]) {
        color ([0, 0, 1, ]) {
          cube ([1.5, 7.25, 76], center=true);
        }
      }
    }
    translate ([0, 41/2, 13.75]) {
      rotate ([90.0,0.0,90.0]) {
        color ([0, 0, 1, ]) {
          cube ([1.5, 7.25, 76], center=true);
        }
      }
    }
  }
  translate ([0, 0, 36]) {
    union () {
      translate ([37.75, 0, 0]) {
        union () {
          translate ([1.5, 0, 33.25]) {
            rotate ([90.0,0.0,0.0]) {
              color ([0, 1, 0, ]) {
                cube ([1.5, 5.5, 39], center=true);
              }
            }
          }
          translate ([1.5, 0, 23.75]) {
            rotate ([90.0,0.0,0.0]) {
              color ([0, 1, 0, ]) {
                cube ([1.5, 5.5, 39], center=true);
              }
            }
          }
          translate ([1.5, 0, 14.25]) {
            rotate ([90.0,0.0,0.0]) {
              color ([0, 1, 0, ]) {
                cube ([1.5, 5.5, 39], center=true);
              }
            }
          }
          translate ([0, 39/2, 18]) {
            color ([0, 0, 1, ]) {
              cube ([1.5, 7.25, 36], center=true);
            }
          }
          translate ([0, -39/2, 18]) {
            color ([0, 0, 1, ]) {
              cube ([1.5, 7.25, 36], center=true);
            }
          }
        }
      }
      translate ([-37.75, 0, 0]) {
        rotate ([0.0,0.0,180.0]) {
          union () {
            translate ([1.5, 0, 33.25]) {
              rotate ([90.0,0.0,0.0]) {
                color ([0, 1, 0, ]) {
                  cube ([1.5, 5.5, 39], center=true);
                }
              }
            }
            translate ([1.5, 0, 23.75]) {
              rotate ([90.0,0.0,0.0]) {
                color ([0, 1, 0, ]) {
                  cube ([1.5, 5.5, 39], center=true);
                }
              }
            }
            translate ([1.5, 0, 14.25]) {
              rotate ([90.0,0.0,0.0]) {
                color ([0, 1, 0, ]) {
                  cube ([1.5, 5.5, 39], center=true);
                }
              }
            }
            translate ([0, 39/2, 18]) {
              color ([0, 0, 1, ]) {
                cube ([1.5, 7.25, 36], center=true);
              }
            }
            translate ([0, -39/2, 18]) {
              color ([0, 0, 1, ]) {
                cube ([1.5, 7.25, 36], center=true);
              }
            }
          }
        }
      }
      translate ([0, -41/2, 31.25]) {
        rotate ([90.0,0.0,90.0]) {
          color ([0, 1, 0, ]) {
            cube ([1.5, 5.5, 76], center=true);
          }
        }
      }
      translate ([0, 41/2, 31.25]) {
        rotate ([90.0,0.0,90.0]) {
          color ([0, 1, 0, ]) {
            cube ([1.5, 5.5, 76], center=true);
          }
        }
      }
      translate ([0, -41/2, 21.0]) {
        rotate ([90.0,0.0,90.0]) {
          color ([0, 0, 1, ]) {
            cube ([1.5, 7.25, 76], center=true);
          }
        }
      }
      translate ([0, 41/2, 21.0]) {
        rotate ([90.0,0.0,90.0]) {
          color ([0, 0, 1, ]) {
            cube ([1.5, 7.25, 76], center=true);
          }
        }
      }
      translate ([0, 0, 26.0]) {
        color ([1, 1, 1, ]) {
          cube ([74, 39, 8], center=true);
        }
      }
    }
  }
}
