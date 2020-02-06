import time
from p001 import P001
from p002 import P002
from p003 import P003
from p004 import P004
from p005 import P005
from p006 import P006
from p007 import P007
from p008 import P008
from p009 import P009
from p010 import P010
from p011 import P011
from p012 import P012
from p013 import P013
from p014 import P014
from p015 import P015
from p016 import P016
from p017 import P017
from p018 import P018
from p019 import P019
from p020 import P020

def main():
	start_time = time.time()

	P001().run()
	P002().run()
	P003().run()
	P004().run()
	P005().run()
	P006().run()
	P007().run()
	P008().run()
	P009().run()
	P010().run()
	P011().run()
	P012().run()
	P013().run()
	P014().run()
	P015().run()
	P016().run()
	P017().run()
	P018().run()
	P019().run()
	P020().run()
	
	total_time = time.time() - start_time
	print('Total time:', total_time, 's')


if __name__ == "__main__":
	main()