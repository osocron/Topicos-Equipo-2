using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Chain
{
    class Purchase
    {
        private int _number;
        private double _amount;
        private string _purpose;


        public Purchase(int number, double amount, string purpose)
        {
            this._amount = amount;
            this._number = number;
            this._purpose = purpose;
        }


        //Sets y gets de cada atributo.
        public int Number { get { return _number; } set { _number = value; } }

        public double Amount{ get { return _amount; } set { _amount = value; } }

        public string Purpuse { get { return _purpose; } set { _purpose = value; } }



    }
}
