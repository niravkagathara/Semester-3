while (true) {
      System.out.println(disp.Info + " -> " + disp.Next);
      if (disp.Next == head) {
        break;
      }
      disp = disp.Next;
    }