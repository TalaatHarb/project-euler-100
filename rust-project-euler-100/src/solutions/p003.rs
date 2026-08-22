use crate::{Runable, Solvable};

fn is_prime(n: u64) -> bool {
    if n < 2 { return false; }
    if n == 2 { return true; }
    if n % 2 == 0 { return false; }
    let limit = (n as f64).sqrt() as u64;
    let mut i = 3u64;
    while i <= limit {
        if n % i == 0 { return false; }
        i += 2;
    }
    true
}

pub struct P003;
impl Solvable for P003 {
    fn problem_name(&self) -> &str { "p003" }
    fn solve(&self) -> i64 {
        let number: u64 = 600_851_475_143;
        let mut limit = (number as f64).sqrt() as u64;
        if limit % 2 == 0 { limit -= 1; }
        let mut factor = limit;
        loop {
            if number % factor == 0 && is_prime(factor) {
                return factor as i64;
            }
            if factor <= 2 { break; }
            factor -= 2;
        }
        number as i64
    }
}
impl Runable for P003 {}
